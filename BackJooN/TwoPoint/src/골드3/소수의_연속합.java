package 골드3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class 소수의_연속합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        // list -> toArray
        int[] arr = list.stream().mapToInt(i -> i.intValue()).toArray();
        int solution = solution(arr, num);
        System.out.println(solution);

    }

    private static int solution(int[] arr, int num) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;

        while (true) {

            if (sum >= num) {
                if (sum == num) cnt++;
                sum -= arr[start];
                start++;
            } else {
                if (end == arr.length) break;
                sum += arr[end];
                end++;
            }
        }
        return cnt;

    }

    private static boolean isPrime(int num) {

        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
