package topoint;

import java.util.Scanner;

public class 수들의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        long cnt = 0;
        for (int i = 1; i < num; i++) {
            if(sum > num) break;
            sum +=i;
            cnt +=1;
        }

        System.out.println(cnt-1);


    }
}
