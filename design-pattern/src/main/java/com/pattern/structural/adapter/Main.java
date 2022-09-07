package com.pattern.structural.adapter;

public class Main {
    public static void main(String[] args) {

        AssignmentWork aw =new AssignmentWork();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.writeAssignment("I am writing");
    }
}
