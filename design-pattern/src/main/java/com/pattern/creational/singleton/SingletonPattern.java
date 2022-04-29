package com.pattern.creational.singleton;

public class SingletonPattern {

    //create an object of SingleObject
    private static SingletonPattern instance = new SingletonPattern();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingletonPattern(){}

    //Get the only object available
    public static SingletonPattern getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
