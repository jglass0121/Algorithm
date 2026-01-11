package me;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실_배정_gpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // 시작 시간
            arr[i][1] = sc.nextInt(); // 종료 시간
        }

        // 1️⃣ 종료 시간 기준 정렬
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        System.out.println("Arrays.toString(arr) = " + Arrays.deepToString(arr));

        // 2️⃣ 그리디 선택
        int count = 0;
        int endTime = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= endTime) {
                endTime = arr[i][1];

                count++;
            }
        }

        System.out.println(count);
    }
}
