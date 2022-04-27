package com.pattern.builder;

public class Phone {
    String name;
    String os;
    String hd;
    String brand;
    Integer screenSize;
    Integer ram;

    public Phone(String name, String os, String hd, String brand, Integer screenSize, Integer ram) {
        this.name = name;
        this.os = os;
        this.hd = hd;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", os='" + os + '\'' +
                ", hd='" + hd + '\'' +
                ", brand='" + brand + '\'' +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                '}';
    }
}
