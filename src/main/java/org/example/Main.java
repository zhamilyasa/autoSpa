package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static int id = 3;
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car auto = (Car) context.getBean("BMW");

        Client ctxDriver = (Client) context.getBean("Aru");
        Client ctxDriver2 = (Client) context.getBean("Zhami" );

        ctxDriver.setCar(auto);
        System.out.println(ctxDriver );
        System.out.println(ctxDriver2);

        // todo
        Service service = (Service) context.getBean("Service");
        service.setCar(auto);
        service.setName("Auto Wash");

        System.out.println(auto.getServiceAsString());


        // todo delete Car2 class and just use Car class
        //ctx -> singleton Client, Car
        // service Client -> Car | Service



    }
}


//        System.out.println(car2);
//        System.out.println("Client name "+ c.getName());
//        System.out.println("Cars name" + c.getCar() );
//        System.out.println(auto);