package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarInLambda {
    public static void main(String[] args) {
        List<Integer>numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.sort((Integer n,Integer m)->m.compareTo(n));
        System.out.println(numbers);
    }
}
