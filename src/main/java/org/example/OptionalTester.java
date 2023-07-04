package org.example;

import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) {
        String name = null;

        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        name = "Joe";
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());
    }
}
