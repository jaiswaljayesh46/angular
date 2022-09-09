package com.pattern.behavioral.chainofresponsibilities;

import java.util.Arrays;

public class ThreeDimension implements Chain{

    Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain = c;
    }

    @Override
    public void process(Dimension d) {
        if(d.getCoordinates().length ==3){
            System.out.println("ThreeDimension area is = "+ Arrays.toString(d.getCoordinates()));
        }else{
            System.out.println("Not Possible");;
        }
    }
}
