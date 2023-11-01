import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _17484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[][] arr = new int[n][m];
        int[][][] dp = new int[n][m][3]; //높이, 세로, 가로

        for (int i = 0; i < n; i++) {
            String[] s1 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] =  Integer.parseInt(s1[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], 100001);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++)  { // 오른. 중간, 왼
                dp[0][i][j] = arr[0][i];
            }
        }

        for (int i = 1; i < n; i++) {
            dp[i][0][0] = Integer.MAX_VALUE;
            dp[i][m - 1][2] = Integer.MAX_VALUE;

        }

    }

}

