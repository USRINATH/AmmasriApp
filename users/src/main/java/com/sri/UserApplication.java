package com.sri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

//@Autowired
 //MonoFluxTest monoFluxTest;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        System.out.println("UserApplication");
        //MonoFluxTest monoFluxTest=new MonoFluxTest();
        //monoFluxTest.testMono();
    }

}
