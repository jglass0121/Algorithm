package me;

import java.util.Arrays;
import java.util.Scanner;

//틀림
public class 회의실_배정_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr,(a,b)->{
            return a[0] - b[0];
        });

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            // 시작
            int start = arr[i][0];
            int end = arr[i][1];
            int cnt = 1;
            for (int j = i; j < arr.length; j++) {
                int nextStart = arr[j][0];
                int nextEnd = arr[j][1];
                if (end <= nextStart && start < nextStart && end <= nextEnd) {
                    start = nextStart;
                    end = nextEnd;
                    cnt++;
                }

            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);
    }
}
