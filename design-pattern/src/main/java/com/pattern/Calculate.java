package com.pattern;

public class Calculate {
    public static void main(String[] args) {
        int p = 10000;
        int n = 24;
        int r = 5;
        double ir = p* Math.pow((1+(n/100)),2);
        System.out.println(ir);
    }
}
