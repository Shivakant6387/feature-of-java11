package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@interface NonNull {}
public class VarVariable {
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("Java", "HTML");

        String tutorials = tutorialsList.stream()
                .map((@NonNull var tutorial) -> tutorial.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(tutorials);
    }
}
