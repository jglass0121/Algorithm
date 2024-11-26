package me;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 학급회장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str= sc.nextLine();
        String[] arr = str.split("");
        solution(arr);

    }

    private static void solution(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        String max = "";

        int value = 0;
        Iterator<String> keys = map.keySet().iterator();
        while( keys.hasNext() ){
            String strKey = keys.next();
            Integer val = map.get(strKey);

            if (val > value) {
                value = val;
                max = strKey;
            }
        }

        System.out.println(max);

    }

}
