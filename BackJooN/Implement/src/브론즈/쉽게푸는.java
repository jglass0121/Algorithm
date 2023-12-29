package 브론즈;

import java.util.Scanner;

public class 쉽게푸는 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[B + 1];

        int cnt = 0;
        int sum = 0;
        for (int i = 1; i <= B + 1; i++) {
            for (int j = 0; j < i; j++) {
                cnt++;
                if (A <= cnt && cnt <= B) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);




    }
}
