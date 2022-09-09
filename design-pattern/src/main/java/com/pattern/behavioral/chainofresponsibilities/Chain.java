package com.pattern.behavioral.chainofresponsibilities;



public interface Chain {
    void setNext(Chain c);
    void process(Dimension d);
}
