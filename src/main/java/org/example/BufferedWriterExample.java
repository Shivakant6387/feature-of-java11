package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer=null;
        try {
            writer=new BufferedWriter(new FileWriter("data.txt"));
            String file="Hey what are you doing at this moment";
            writer.write(file);
      } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
