package 실버3;

import java.util.Scanner;

public class 숫자정사각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        int min = Math.min(N, M);

        while (min > 1) {
            for (int i = 0; i <= N - min; i++) {
                for (int j = 0; j <= M - min; j++) {
                    int num = arr[i][j];
                    if (num == arr[i][j + min - 1] &&
                            num == arr[i + min - 1][j] &&
                            num == arr[i + min - 1][j + min - 1]) {
                        System.out.println(min * min);
                        return;
                    }
                }

            }

            min--;
        }  

        System.out.println("min*min = " + min*min);




    }
}
