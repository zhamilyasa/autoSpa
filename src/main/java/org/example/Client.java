package org.example;

import java.util.ArrayList;
import java.util.List;

public class

Client{
    String name;
    int bonus;

    String paymentMethod ;
    Car auto;
    List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Client(String name, int bonus, String paymentMethod, Car auto) {
        this.name = name;
        this.bonus = bonus;
        this.paymentMethod = paymentMethod;
        setCar(auto);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int age) {
        this.bonus = bonus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public Car getCar() {
        return auto;
    }


    public void setCar(Car auto) {
        this.auto = auto;
        cars.add(auto);
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                ", paymentMethod=" + paymentMethod +
                ", \n current order  = " + auto +
                ", \n    order history = " + cars +
                '}';
    }
}
