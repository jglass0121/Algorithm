import java.util.Arrays;
import java.util.Scanner;

public class _1992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String nu = sc.next();

            for (int j = 0; j < num; j++) {
                arr[i][j] = nu.charAt(j) - '0';
            }
        }

        fac(arr, 0, 0, num);
        System.out.println(sb.toString());

    }

    static StringBuilder sb = new StringBuilder();
    private static void fac(int[][] arr, int x, int y, int size) {
        if (check(arr, x, y, size, arr[x][y])) {
            sb.append(arr[x][y]);
            return;
        }

        sb.append("(");

        fac(arr, x, y, size / 2);
        fac(arr, x, y + size / 2, size / 2);
        fac(arr, x + size / 2, y, size / 2);
        fac(arr, x + size / 2, y + size / 2, size / 2);

        sb.append(")");

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
