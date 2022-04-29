package com.pattern.behavioral.observer;

public class Subscriber /*implements Observer*/{//optional

    private String subName;

    public Subscriber(String subName) {
        this.subName = subName;
    }

    public void update(String videoName) {
        System.out.println("Hey "+subName+" video uploaded : " + videoName);
    }
}
