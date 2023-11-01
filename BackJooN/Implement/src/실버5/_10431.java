package 실버5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            Integer.parseInt(st.nextToken());

            int cnt = 0;
            int[] numbers = new int[20];
            for (int j = 0; j < 20; j++) {
                numbers[j] =  Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if (numbers[k] > numbers[j]) {
                        cnt++;
                    }
                }
            }

            System.out.println(i + " " + cnt);

        }
    }

}

