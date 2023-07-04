package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadAndWrite {
    public static void main(String[] args) throws IOException {
        Path path= Files.createTempFile("demo",".txt");
        Files.writeString(path,"Hey Vogel");
        String str=Files.readString(path);
        System.out.println(str);
    }
}
