package com.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

public class GFG {

    public static void main(String[] args)
    {
        String str = "aba";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }

        map.entrySet().stream().forEach(e ->{
        System.out.println(e.getKey() +"="+e.getValue());
    });

    }
}
class Parent{
    String name;
    public Parent(String name) {
        System.out.println("Parent constructor" + name);
    }
    public Parent() {
        System.out.println("Parent empty constructor");
    }
    public void display(String name) {
        System.out.println("Parent display" + name);
    }
}

class Child extends Parent{
    String name;

    public Child(String name) {
        super(name);
        System.out.println("Parent constructor" + name);

    }
    @Override
    public void display(String name) {
        System.out.println("Parent display" + name);
        super.display("child");
    }
}
