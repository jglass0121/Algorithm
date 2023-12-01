package _backTracking;

import java.util.Scanner;

public class _2630 {
    static int[] result = new int[2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        fac(arr,0,0,arr.length,arr[0][0]);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static void fac(int[][] arr, int x, int y, int size, int val) {
        if (check(arr, x, y, size, val)) {
            result[val]++;
            return;
        }

        int newSize = size / 2;
        fac(arr, x, y, newSize, arr[x][y]);
        fac(arr, x+newSize, y, newSize, arr[x+newSize][y]);
        fac(arr, x, y+newSize, newSize, arr[x][y+newSize]);
        fac(arr, x+newSize, y+newSize, newSize, arr[x+newSize][y+newSize]);


    }

    public static boolean check(int[][] arr, int x, int y, int size, int val) {
        for (int i = x; i <x+size ; i++) {
            for (int j = y; j < y + size; j++) {
                if (val != arr[i][j]) {
                    return  false;
                }
            }
        }
            return true;
    }
}
