package 실버5;

import java.util.Scanner;

public class 날짜계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int e = 0, s = 0, m = 0;gu
        int res = 0;
        while (true) {
            e++;
            s++;
            m++;
            res++;
            if(e==16){
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if(m == 20){
                m = 1;
            }

            if (e == Integer.parseInt(split[0]) &&
                    s == Integer.parseInt(split[1]) &&
                    m == Integer.parseInt(split[2])
            ) {
                System.out.println("res = " + res);
                break;
            }
        }


    }
}
