package org.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArrayExample {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Sakshi");
        list.add("Vogel");
        list.add("Mac");
        list.add("Maki");
        list.add("Jon");
        list.add("Jacson");
        String []array=list.stream().toArray(String[]::new);
        for (String s:array){
            System.out.println(s);
        }
    }
}
