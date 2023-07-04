package org.example;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;

public class TestLines {
    public static void main(String[] args) {
        String str="This\n is\n a\n String";
        List<String>list=str.lines().collect(Collectors.toList());
        System.out.println(list);
    }
}
