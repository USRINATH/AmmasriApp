package com.sri;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;


@Service
public class AmmaFurnitureOrder {

    private static final Logger logger= LoggerFactory.getLogger(AmmaFurnitureOrder.class);

    private KafkaTemplate<String, String> kafkaTemplate;

    public AmmaFurnitureOrder(KafkaTemplate<String, String> kafkaTemplate){

        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendOrder() throws InterruptedException {

        String topic="furniture_order";
        EventHandler eventHandler=new FurnitureOrderHandler(kafkaTemplate,topic);
        String url="https://stream.wikimedia.org/v2/stream/recentchange";

        EventSource.Builder eventbuilder=new EventSource.Builder(eventHandler, URI.create(url));

        EventSource eventSource=eventbuilder.build();
        eventSource.start();
        TimeUnit.MINUTES.sleep(10);
    }
}
