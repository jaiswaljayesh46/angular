package com.pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();
        PassengerCar passengerCar = new PassengerCar(basicCar);
        passengerCar.design();

        LuxuryCar luxuryCar = new LuxuryCar(basicCar);
        luxuryCar.design();
    }
}
/*
===o/p=====
 Basic car with Passenger Car.
 Basic car with Luxury Car.
 */