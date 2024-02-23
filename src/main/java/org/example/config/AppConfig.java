package org.example.config;

import org.example.Car;
import org.example.Client;
import org.example.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.example.Main.id;

@Configuration
public class AppConfig {
    @Bean("firstBean")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Car currentHistory() {
        return new Car();
    }
    @Bean("KIA")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Car currenHistoryForZhami(){
        return  new Car();
    }
    @Bean(name = "BMW")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Car orderHistory() {
        return new Car(id++, "BMW");
    }
    @Bean("KIA")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Car orderHistoryForZhami() {
        return new Car(id++, "KIA");
    }


    @Bean("Aru")
    public  Client clientAutoSpa() {
        Client Aru = new Client(
                "Aruzhan",
                2000,
                "visa",
                currentHistory());
        return Aru;
    }
    @Bean("Zhami")
    public Client clientAutoSpa2(){
        Client Zhami = new Client(
                "Zhamilya",
                1500,
                "cash",
                currenHistoryForZhami());
                Zhami.setCar(car());
        return Zhami;
    }
    @Bean("Mitsubishi")
    public Car car() {
        Car car1=new Car();
        car1.setName("Mitsubishi Lanser");
        return car1;
    }
    @Bean("Service")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Service service(String s){
        return new Service();
    }


}
