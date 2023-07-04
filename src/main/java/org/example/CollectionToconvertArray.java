package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionToconvertArray {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        Integer[] arr=list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
