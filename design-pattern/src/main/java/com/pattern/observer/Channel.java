package com.pattern.observer;

import java.util.*;

public class Channel /*implements Subject*/{//optional
    private String chName;
    private List<Subscriber> subList = new ArrayList<>();

    public Channel(String chName) {
        this.chName = chName;
    }

    public void subscribe(Subscriber sub){
        subList.add(sub);
    }

    public void unSubscribe(Subscriber sub){
        subList.remove(sub);
    }

    public void notifySubscriber(String videoName){
        subList.stream().forEach(sub -> sub.update(videoName));
    }

    public void upload(String videoName){
        notifySubscriber(videoName);
    }


}
