package 브론즈;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = 0;
        int minPrime = -1;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (minPrime == -1) {
                    minPrime = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
