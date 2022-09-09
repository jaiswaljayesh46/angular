package com.pattern.behavioral.chainofresponsibilities;

import java.util.Arrays;

public class OneDimension implements Chain{

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Dimension d) {
        if(d.getCoordinates().length ==1){
            System.out.println("OneDimension area is = "+ Arrays.toString(d.getCoordinates()));
        }else{
            nextInChain.process(d);
        }
    }
}
