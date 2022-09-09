package com.pattern.behavioral.command;

public class SetupBox {
    public void on(){
        System.out.println("SetupBox is on");
    }

    public void off(){
        System.out.println("SetupBox is off");
    }

    public void setChannel(int channelNo){
        System.out.println("SetupBox channel no. "+channelNo);
    }

    public void setVolume(int volume){
        System.out.println("SetupBox volume is "+volume);
    }
}
