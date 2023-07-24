package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=  Integer.parseInt(br.readLine());
        }
        System.out.println("arr = " + arr);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}