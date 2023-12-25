package com.sri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class AmmaTimberRecieveMsg {

    private static Logger logger= LoggerFactory.getLogger(AmmaTimberRecieveMsg.class);
   // @Autowired
  //  public Acknowledgment ack;
    @KafkaListener(topics = "furniture_order",
    groupId = "myGroup")
    public void consume(String eventMsg){
        logger.info("Message Recived-->"+eventMsg);
       // ack.acknowledge();
    }
}
