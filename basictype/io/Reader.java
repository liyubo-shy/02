package io.b1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        File path = new File("D:\\idea破解\\1653399923-68844c084bad353\\使用前必读.txt");
        FileReader fileReader = new FileReader(path);
        int data = 0;
        while ((data = fileReader.read())!= -1){
            System.out.println((char) data);
        }
        fileReader.close();
    }
}
