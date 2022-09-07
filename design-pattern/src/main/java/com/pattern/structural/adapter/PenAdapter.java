package com.pattern.structural.adapter;

import com.pattern.structural.adapter.otherpen.MarkerPen;

public class PenAdapter implements Pen{

    MarkerPen m = new MarkerPen();


    @Override
    public void write(String str) {
        m.mark(str);
    }
}
