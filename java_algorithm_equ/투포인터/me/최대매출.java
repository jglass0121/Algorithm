package me;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 최대매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int N = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        String[] str2 = sc.nextLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }

        int max = 0;
        for (int i = 0; i < N - k-1; i++) {
            int sum = 0;
            int start = i;
            int idx = 0;
            for (int j = idx; j < k; j++) {
                sum += arr[start];
                start++;
                idx++;
            }

            if(max < sum) max = sum;
        }
        System.out.println(max);
    }


}
