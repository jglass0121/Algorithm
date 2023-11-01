package L1;

import java.util.Scanner;

public class _콜라츠_추측 {
    public static void main(String[] args) {
        long n = 626331;
        System.out.println( solution(n));
    }


    private static int solution(long n) {

        int cnt = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;

            } else {
                n = (3 * n) + 1;
            }
            cnt++;
            if (cnt >= 500) {
                cnt = -1;
                break;
            }
        }
        return cnt;


    }

}
