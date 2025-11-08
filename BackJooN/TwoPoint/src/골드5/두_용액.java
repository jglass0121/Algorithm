package 골드5;

import java.util.Arrays;
import java.util.Scanner;

public class 두_용액 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nun = sc.nextInt();
        long[] arr = new long[nun];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        solution(arr);
    }

    private static void solution(long[] arr) {
        //두 수의 합이 0과 가까운가?
        Arrays.sort(arr);
        // -99 -2 -1 4 98

        int s = 0;
        int e = arr.length - 1;
        long min = Integer.MAX_VALUE;
        long[] res = new long[2];
        // 투 포인터
        while (s < e) {
            long sum = arr[s] + arr[e];
            long abs = Math.abs(sum); // 절대값
            // 0과 가까운지 체크

            if (abs < min) { // 갱신
                min = abs;
                res[0] = arr[s];
                res[1] = arr[e];

            }

            if (sum > 0) {
                e--;
            } else {
                s++;
            }
        }

        System.out.println(res[0] + " "+ res[1]);


    }
}
