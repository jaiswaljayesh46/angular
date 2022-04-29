package com.pattern.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("channel-1");

        Subscriber s1 = new Subscriber("S1");
        Subscriber s2 = new Subscriber("S2");
        Subscriber s3 = new Subscriber("S3");
        Subscriber s4 = new Subscriber("S4");

        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);
        ch.subscribe(s4);

        ch.upload("Learning Java");

        System.out.println("S4 has unsuscribed");

        ch.unSubscribe(s4);
        ch.upload("Learning Python");

    }
}
/*====o/p===========
Hey S1 video uploaded : Learning Java
Hey S2 video uploaded : Learning Java
Hey S3 video uploaded : Learning Java
Hey S4 video uploaded : Learning Java
S4 has unsuscribed
Hey S1 video uploaded : Learning Python
Hey S2 video uploaded : Learning Python
Hey S3 video uploaded : Learning Python
 */