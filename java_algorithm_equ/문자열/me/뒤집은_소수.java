package me;

import java.util.Scanner;

public class 뒤집은_소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println(solution(num, arr));
    }

    private static String solution(int num, String[] arr) {
        StringBuilder answer= new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            String str = arr[i];
            String strReverse = sb.append(str).reverse().toString();
            int val = Integer.parseInt(strReverse);
            // 소수인가?
            if (isPrime(val)) {
                answer.append(val).append(" ");
            }
        }

        return answer.toString();
    }

    private static boolean isPrime(int val) {
        if (val < 2) {
            return false;
        }
        if(val == 2) return true;


        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) {// 소수 아님
                return false;
            }
        }
        return true;
    }
}
