package com.pattern.behavioral.chainofresponsibilities;

public class Main {

    public static void main(String[] args) {
        OneDimension c1 = new OneDimension();
        TwoDimension c2 = new TwoDimension();
        ThreeDimension c3 = new ThreeDimension();
        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Dimension(5));
        c1.process(new Dimension(5,6));
        c1.process(new Dimension(5,6,7));
        c1.process(new Dimension(5,6,7,8));

    }
}
