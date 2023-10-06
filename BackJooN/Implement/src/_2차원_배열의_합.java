import java.util.Scanner;
import java.util.StringTokenizer;

public class _2차원_배열의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int[][] arr= new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();
        sc.nextLine();

        for (int k = 0; k < num; k++) {
            String[] split = sc.nextLine().split(" ");
            int i = Integer.parseInt(split[0]) - 1;
            int j = Integer.parseInt(split[1]) - 1;
            int x = Integer.parseInt(split[2]) - 1;
            int y = Integer.parseInt(split[3]) - 1;
            int sum = 0;

            // (i,j)부터 (x,y)까지 더하기
            for (int p = i; p <= x; p++) {
                for (int q = j; q <= y; q++) {
                    sum += arr[p][q];
                }
            }
            System.out.println("sum = " + sum);
        }

    }
}
