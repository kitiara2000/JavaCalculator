package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.*;

public class Utility {

    private static String TARGET = "C:\\Users\\EBureacova\\IdeaProjects\\Projects\\Calc\\target";

    public static void writeToFile(String text){
        Path path = Paths.get(TARGET, "\\history.txt");
        try {
            Files.write(path, text.getBytes(UTF_8), CREATE, APPEND);
        } catch (IOException e) {
            System.err.format("I/O Error opening/creating file");
            e.printStackTrace();
        }
    }
}
