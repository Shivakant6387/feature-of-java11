package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("data.txt");
        String content= Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(content);
    }
}
