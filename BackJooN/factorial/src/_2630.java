import java.util.Arrays;
import java.util.Scanner;

public class _2630 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        fac(arr, 0, 0, num);
        System.out.println(answer[0]);
        System.out.println(answer[1]);


    }

    static int[] answer = new int[2];
    private static void fac(int[][] arr, int x, int y, int size) {
        if (check(arr, x, y, size, arr[x][y])) {
            answer[arr[x][y]]++;
            return;
        }

        fac(arr, x, y, size / 2);
        fac(arr, x+size/2, y, size / 2);
        fac(arr, x, y+size/2, size / 2);
        fac(arr, x+size/2, y+size/2, size / 2);

    }

    private static boolean check(int[][] arr, int x, int y, int size, int val) {

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }
}
