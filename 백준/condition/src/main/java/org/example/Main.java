package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int read =  Integer.parseInt( br.readLine());

        String score = null;
        if (read >= 90) {
            score = "A";

        } else if (read >= 80) {
            score = "B";
        } else if (read >= 70) {
            score = "C";
        } else if (read >= 60) {
            score = "D";
        } else {
            score = "F";
        }

        System.out.println( score);
    }
}