package com.pattern.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game c = new Chess();
        c.play();

        Game l = new Ludo();
        l.play();
    }
}
