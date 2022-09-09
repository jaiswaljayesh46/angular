package com.pattern.behavioral.chainofresponsibilities;

public class Dimension {

    private int coordinates [];

    public Dimension(int x){
        this.coordinates = new int[]{x};
    }


    public Dimension(int x,int y){
        this.coordinates = new int[]{x, y};
    }

    public Dimension(int x,int y,int z){
        this.coordinates = new int[]{x, y, z};
    }

    public Dimension(int x,int y,int z,int p){
        this.coordinates = new int[]{x, y, z, p};
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }
}
