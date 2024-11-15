package me;

import java.util.Scanner;

public class 보이는_학생 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(arr);
        System.out.println(solution);

    }

    private static int solution(int[] arr) {
        int answer = 1;
        int idx = 0; // 앞
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                answer++;
                max = arr[i];
            }

        }

        return answer;


    }
}
