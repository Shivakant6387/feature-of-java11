package org.example;

public class Strip {
    public static void main(String[] args) {
        String str="    String      ";
        System.out.println("$"+str+"$");
        System.out.println("$"+str.strip()+"$");
        System.out.println("$"+str.stripLeading()+"$");
        System.out.println("$"+str.stripTrailing()+"$");
    }
}
