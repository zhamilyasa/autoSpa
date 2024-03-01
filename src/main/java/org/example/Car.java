package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static org.example.Main.id;

public class Car {
    protected int number;
    private String name;

    private ArrayList<String> services = new ArrayList<>();


    @Override
    public String toString() {
        return "\n Car{" +
                "number=" + number +
                ", name='" + name + '\'' +
                "} " + Integer.toHexString(hashCode()) + " ! ";
    }

    public void addServices(Service service) {
        services.add(service.getName());
    }

    public String getServiceAsString() {
        return services.stream().collect(Collectors.joining(", "));
    }



    public Car() {
        number = id++;
        name = " GT-R r35 ";
        services.add(" tire mouting");

    }


    public Car(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServices(String services) {
        return services;
    }


}