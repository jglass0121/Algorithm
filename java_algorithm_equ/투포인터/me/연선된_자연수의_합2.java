package me;

import java.util.Scanner;

public class 연선된_자연수의_합2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        int s = 0, e = 0;

        int res = 0, sum = 0;
        while (e != num && s !=num) {
            if (sum < num) {
                sum += e;
                e++;
            } else if (sum > num) {
                sum -= s;
                s++;
            }
            if (sum == num) {
                res++;
                sum += e++;
            }
        }
        System.out.println(res);
    }
}
