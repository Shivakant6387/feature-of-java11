package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotMethod {
    public static void main(String[] args) {
        Predicate<String>startWithZ=s->s.charAt(0)=='z';
        Predicate<String>doesNotStartWithZ=Predicate.not(startWithZ);
        List<String>list= Arrays.asList("za","zs","zq","zp","zd","as","sd");
        List<String>startStringWithZ=list.stream().filter(startWithZ).collect(Collectors.toList());
        List<String>strdoesNotStartWithZ=list.stream().filter(doesNotStartWithZ).collect(Collectors.toList());
        System.out.println(startStringWithZ);
        System.out.println(strdoesNotStartWithZ);
    }
}
