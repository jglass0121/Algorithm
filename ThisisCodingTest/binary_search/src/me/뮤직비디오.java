package me;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // 용량
        int start = arr[N - 1];
        int end = Arrays.stream(arr).sum();
        int res = 0;

        while (start <= end) {
            int mid = (start + end) /2;
            if (cnt(mid, arr) <= M) { // 가능
                res = mid;
                end = mid-1; // 더 작은 값을 향해서
            }else{
                start = mid+1;
            }
        }

        System.out.println(res);

    }

    private static int cnt(int time, int[] arr) {

        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > time) {
                sum = arr[i];
                cnt++;
            }else{
                sum += arr[i];

            }
        }
        return cnt;
    }
}
