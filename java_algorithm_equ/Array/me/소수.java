package me;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);

    }

    private static void solution(int num) {

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(isPrime(i)){
                sum++;
            }
        }

        System.out.println(sum);
    }

    private static boolean isPrime(int num) {
        if(num <2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if( num % i== 0) {
                return false;
            }
        }
        return true;
    }
}
