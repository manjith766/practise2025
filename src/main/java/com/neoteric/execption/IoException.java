package com.neoteric.execption;

import java.io.FileReader;
import java.io.IOException;

public class IoException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("file.txt"); // Checked Exception
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
