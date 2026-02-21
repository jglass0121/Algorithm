package me;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간_정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int start =1;
        int end = arr[N-1];
        int res = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(count(mid,arr) >= C){ // 가능
                res = mid;
                start = mid+1;

            }else { // 불가능
                end = mid-1;
            }
        }

        System.out.println(res);
    }

    private static int count(int dis, int[] arr) {
        int cnt = 1;
        int start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-start >= dis) {
                cnt++;
                start = arr[i];
            }
        }
        return cnt;
    }
}
