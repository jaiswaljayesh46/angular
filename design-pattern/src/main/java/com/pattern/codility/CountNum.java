package com.pattern.codility;

import java.util.HashMap;
import java.util.Map;

public class CountNum {

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
