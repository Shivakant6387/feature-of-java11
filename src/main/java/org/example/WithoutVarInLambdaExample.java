package org.example;

import java.util.stream.IntStream;

public class WithoutVarInLambdaExample {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5,6,7,8,9,10).filter(i -> i%2==1).forEach(System.out::println);
    }
}
