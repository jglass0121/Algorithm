package 실버5;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        while (num > 0) {
            if (num % 5 == 0) {
            cnt += num / 5;
            System.out.println(cnt);
            return;
            }
            if (num < 3) {
                System.out.println(-1);
                return;
            }
            num -= 3;
            cnt++;
        }
        System.out.println(cnt);

    }
}
