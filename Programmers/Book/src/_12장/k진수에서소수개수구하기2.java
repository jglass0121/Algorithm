package _12장;

import java.util.Arrays;

public class k진수에서소수개수구하기2 {
    public static void main(String[] args) {
        int n = 110011;
        int k = 10;
        System.out.println(solution(n, k));
    }

    private static int solution(int n, int k) {
        // 1. k진수 변환
        String res = Integer.toString(n, k);

        // 2. 0 기준으로 분리
        String[] arr = res.split("0+");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int cnt = 0;

        // 3. 소수 판별
        for (String num : arr) {
            if (num.isEmpty()) continue;

            long value = Long.parseLong(num);
            if (isPrime(value)) cnt++;
        }

        return cnt;
    }

    private static boolean isPrime(long value) {
        if (value <= 1) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;

        for (long i = 3; i * i <= value; i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }
}