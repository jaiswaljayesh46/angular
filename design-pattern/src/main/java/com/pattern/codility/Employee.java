package com.pattern.codility;

import java.util.*;

public class Employee {
    public static void main(String[] args) {
        String[] E = {"039", "4", "14", "32", "", "34", "7"};
        Employee e = new Employee();
        System.out.println(e.solution(E));
    }
    public int solution(String[] E) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        int c = 1;
        for(String e : E){
            int len = e.length();
           for(int i = 0;i<len;i++){
               int s = Integer.parseInt(e.substring(0,1));
               e = e.substring(1);
               ArrayList<Integer> l1 = map.get(s);
               if(l1 == null){
                   l1= new ArrayList<Integer>();
               }
               l1.add(c);
               map.put(s,l1);
           }
           c++;
        }
        int days[] = {0,0,0,0,0,0,0,0,0,0};
        int meeting[] = {0,0,0,0,0,0,0,0,0,0};
        map.entrySet().stream().forEach(e -> {
            int day = e.getKey();
            ArrayList<Integer> list = e.getValue();
            days[day] = list.size();
            meeting[day] = day;
        });

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int m1 =0,m2=0;
        for (int i =0;i<days.length ; i++) {
            if (days[i] > max1) {
                max2 = max1;
                m2= m1;
                max1 = days[i];
                m1=i;
            } else if (days[i] > max2) {
                max2 = days[i];
                m2=i;
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> l3 = map.get(m2);
        hashSet.addAll(map.get(m2));
        hashSet.addAll(map.get(m1));

        return hashSet.size();

    }
}
