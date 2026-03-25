package 실버6;

import java.util.Arrays;
import java.util.Scanner;

public class _10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        Arrays.sort(arr);

        int[] arr2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        String solution = solution(arr, arr2);
        System.out.println(solution);
    }

    private static String solution(int[] arr, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            int res = arr2[i];
            int answer = binarySearch(arr, res);
            sb.append(answer).append(" ");
        }
        return sb.toString();
    }

    private static int binarySearch(int[] arr, int res) {
        int lower = lower(arr, res);
        int upper = upper(arr, res);
        return upper-lower;
    }

    private static int lower(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // 🔥 upper bound
    private static int upper(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

}
