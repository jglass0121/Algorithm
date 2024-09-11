
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int cnt = 0;
    static int M;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String[] split = sc.nextLine().split(" ");
             M = Integer.parseInt(split[0]);
             N = Integer.parseInt(split[1]);
            int K = Integer.parseInt(split[2]);
            arr = new int[M][N];
            for (int j = 0; j < K; j++) {
                String[] xy = sc.nextLine().split(" ");
                int X = Integer.parseInt(xy[0]);
                int Y = Integer.parseInt(xy[1]);
                arr[X][Y] = 1;
            }

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == 1) {
                        dfs(j,k);
                        cnt += 1;
                    }
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }

    }

    private static void dfs(int x, int y) {
        if(x<0||x>= M||y<0||y>=N) return;
        if(arr[x][y]==0) return;
        if (arr[x][y] == 1) {
            arr[x][y] = 0;
            dfs(x + 1, y);
            dfs(x , y+1);
            dfs(x -1, y);
            dfs(x , y-1);
        }
    }
}
