package me;

import java.util.Arrays;
import java.util.Scanner;

public class 가위_바위_보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        solution(arr1, arr2);
    }

    private static void solution(int[] arr1, int[] arr2) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            String answer = "";
            int a = arr1[i];
            int b =  arr2[i];
            // 1 - 가위 2 바위 3 보
            //1 3 - 1
            // 2  1
            if(a == 1){
                if(b == 1){
                    sb.append("D").append("\n");
                } else if (b == 2) {
                    sb.append("B").append("\n");
                } else {
                    sb.append("A").append("\n");
                }
            }else if(a == 2){
                if(b == 1){
                    sb.append("A").append("\n");
                } else if (b == 2) {
                    sb.append("D").append("\n");
                } else {
                    sb.append("B").append("\n");
                }
            } else if (a == 3) {
                if(b == 1){
                    sb.append("B").append("\n");
                } else if (b == 2) {
                    sb.append("A").append("\n");
                } else {
                    sb.append("D").append("\n");
                }
            }


        }
        System.out.println(sb.toString());


    }
}
