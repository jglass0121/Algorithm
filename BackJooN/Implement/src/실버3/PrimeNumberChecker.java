package 실버3;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + "은(는) 소수입니다.");
        } else {
            System.out.println(number + "은(는) 소수가 아닙니다.");
        }

        scanner.close();
    }

    // 주어진 숫자가 소수인지 여부를 확인하는 메서드
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // 2부터 n의 제곱근까지 나누어 떨어지는지 확인
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }

        return true; // 나누어 떨어지지 않으면 소수임
    }
}
