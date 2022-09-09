package com.pattern.behavioral.chainofresponsibilities;

import java.util.Arrays;

public class TwoDimension implements Chain{

    Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Dimension d) {
        if(d.getCoordinates().length ==2){
            System.out.println("TwoDimension area is = "+ Arrays.toString(d.getCoordinates()));
        }else{
            nextInChain.process(d);
        }
    }
}
