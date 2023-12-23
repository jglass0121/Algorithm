package 브론즈;

import java.util.Arrays;
import java.util.Scanner;

public class N번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < num; i++) {
            int[] arr = new int[10];
            String[] split = sc.nextLine().split(" ");
            for (int j = 0; j < 10; j++) {
                int i1 = Integer.parseInt(split[j]);
                arr[j] = i1;
            }

            Arrays.sort(arr);
            System.out.println(arr[arr.length - 3]);

        }
    }
}
