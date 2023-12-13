package 실버6;

import java.util.Arrays;
import java.util.Scanner;

public class _숫자카드2 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            int target = arr2[i];
            int one = lowerBound(arr1, target);
            int two = upperBound(arr1, target);
            int i1 = two - one;
            sb.append(i1).append(" ");

        }


        System.out.println(sb.toString());



}

    private static int upperBound(int[] arr1, int target) {
        int start = 0;
        int end = arr1.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr1[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;

    }



    private static int lowerBound(int[] arr1, int target) {

        int start = 0;
        int end = arr1.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr1[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return end;

    }


}
