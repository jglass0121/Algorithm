import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class _2422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        boolean[][] check = new boolean[n+1][n+1];

        for (int i = 0; i < m; i++) {
            String s1 = sc.nextLine();
            String[] sp = s1.split(" ");
            int ice1 = Integer.parseInt(sp[0]); //1
            int ice2 = Integer.parseInt(sp[1]); //2
            check[ice1][ice2] = true;
            check[ice2][ice1] = true;

        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <=n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (check[i][j] || check[j][k] || check[i][k]) {
                        continue;
                    }
                    ans++;
                }
            }
        }

        System.out.println("ans = " + ans);

    }

}
