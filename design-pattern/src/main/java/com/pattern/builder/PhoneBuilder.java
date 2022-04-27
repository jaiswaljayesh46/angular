package com.pattern.builder;

public class PhoneBuilder {
    String name;
    String os;
    String hd;
    String brand;
    Integer screenSize;
    Integer ram;


    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setHd(String hd) {
        this.hd = hd;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public Phone build(){
        return new Phone(name, os, hd, brand, screenSize, ram);
    }
}
