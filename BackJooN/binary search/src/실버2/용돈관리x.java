package 실버2;

import java.util.Arrays;
import java.util.Scanner;

public class 용돈관리x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[days];
        for (int i = 0; i < days; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        binarySearch(arr,M);
    }

    private static void binarySearch(int[] arr, int m) {
    }

}
