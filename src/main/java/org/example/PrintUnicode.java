package org.example;

public class PrintUnicode {
    public static void main(String[] args) {
        String codepoint="U+1F92A";
        System.out.println(convertCodePoints(codepoint));
    }
    public static char[]convertCodePoints(String codepoint){
        Integer i=Integer.valueOf(codepoint.substring(2),16);
        char[] chars=Character.toChars(i);
        return chars;
    }
}
