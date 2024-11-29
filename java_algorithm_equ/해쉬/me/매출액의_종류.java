package me;

import javax.imageio.ImageTranscoder;
import java.util.HashSet;
import java.util.Scanner;
// no
public class 매출액의_종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        solution(N, K, arr);
    }

    private static void solution(int n, int k, int[] arr) {
        //set

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            HashSet<Integer> set = new HashSet<>();
            int end = i + k - 1;
            if(end > arr.length-1) end = arr.length - 1;
            for (int j = i; j <= end; j++) {
                set.add(arr[j]);
            }

            sb.append(set.size()).append(" ");
        }

        System.out.println(sb.toString());


    }
}
