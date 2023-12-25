package com.sri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmmaFurnitureApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AmmaFurnitureApp.class, args);
        System.out.println("Welcome to AmmaFurnitureApp App");
    }

    @Autowired
    private AmmaFurnitureOrder ammaFurnitureOrder;

    @Override
    public void run(String... args) throws Exception {
        ammaFurnitureOrder.sendOrder();

    }
}
