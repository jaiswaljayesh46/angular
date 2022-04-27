package com.pattern.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Without use of builder design pattern");
        Phone p1 = new Phone("Redmi",null,null,null,5,null);
        System.out.println(p1);

        System.out.println("With use of builder design pattern");
        Phone p2 = new PhoneBuilder().setName("Apple").setScreenSize(4).build();
        System.out.println(p2);
    }
}

/*
====o/p==========
Without use of builder design pattern
Phone{name='Redmi', os='null', hd='null', brand='null', screenSize=5, ram=null}
With use of builder design pattern
Phone{name='Apple', os='null', hd='null', brand='null', screenSize=4, ram=null}
 */
