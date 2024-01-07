package 실버3;

import java.util.Scanner;

public class _1_2_3더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            cnt = 0;
            int target = sc.nextInt();
            fac(target,0);
            System.out.println(cnt);
        }

    }

    static int cnt = 0;
    static int[] numbers = {1, 2, 3};
    private static void fac(int target, int res) {
        if (res == target) {
            cnt++;
            return;
        }
        if (res > target) {
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i];
            fac(target, res);
            res -= numbers[i];
        }

    }
}
