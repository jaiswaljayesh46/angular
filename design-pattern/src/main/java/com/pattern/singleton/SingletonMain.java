package com.pattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingletonPattern object = SingletonPattern.getInstance();

        //show the message
        object.showMessage();
    }
}
