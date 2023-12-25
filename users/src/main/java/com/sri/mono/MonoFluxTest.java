package com.sri.mono;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

@Test
    public void testMono(){


        Mono<?> monoString=Mono.just("Amma").
                then(Mono.error(new RuntimeException("Exception Occured"))).
                log();


        monoString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));

    }


    @Test
    public void testFlux(){


       Flux<?> fluxString= Flux.just("Sri","Java","Spring","SpringBoot","Hibernate","MongDB","Kafka").
               concatWithValues("Aws").
               concatWith(Flux.error(new RuntimeException(("Exception occured in Flux")))).
               concatWithValues("Angular").
               log();

        fluxString.subscribe(System.out::println);
    }

}
