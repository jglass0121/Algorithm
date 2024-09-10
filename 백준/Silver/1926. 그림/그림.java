
import java.util.Scanner;

public class Main {
    static  int[][] arr;
    static int cnt = 0;
    static int max = 0;
    static int n;
    static int m;
    static int countMax = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
         m = sc.nextInt();
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    dfs(i, j);
                    max = Math.max(countMax,max);
                    cnt += 1;
                    countMax = 0;
                }
            }
        }


        System.out.println(cnt);
        System.out.println(max);


    }

    private static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m) {
            return false;
        }

        if (arr[x][y] == 1) {
            arr[x][y] = 0;
            countMax++;
            dfs(x + 1, y);
            dfs(x , y+1);
            dfs(x - 1, y);
            dfs(x, y - 1);
            return true;
        }

        return false;
    }

}
