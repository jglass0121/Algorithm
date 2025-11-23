package me;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class 공통원소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }


        int two = sc.nextInt();
        sc.nextLine();
        String str2 = sc.nextLine();
        String[] split2 = str2.split(" ");
        int[] arr2 = new int[split2.length];
        for (int i = 0; i < split2.length; i++) {
            arr2[i] = Integer.parseInt(split2[i]);
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int p1 = 0; int p2 =0;
        StringBuilder sb = new StringBuilder();
        while (p1 < arr.length && p2 < arr2.length) {
            int answer1 = arr[p1];
            int answer2 = arr2[p2];

            if(answer1  == answer2){
                sb.append(answer1).append(" ");
                p1++;p2++;
            } else if (answer1 >  answer2) {
                p2++;
            }else{
                p1++;
            }
        }

        System.out.println(sb.toString());

    }
}
