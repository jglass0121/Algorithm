import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1987 {
    static boolean[] visited = new boolean[26]; // 영어
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    static int arr1;
    static int arr2;
    static int [][] arr;
    static int[][]  arrInt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
         arr1 = Integer.parseInt(split[0]);
         arr2 = Integer.parseInt(split[1]);

        arr  = new int[arr1][arr2];
         arrInt = new int[arr1][arr2];
        for (int i = 0; i < arr1; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < arr2; j++) {
                arr[i][j] = str.charAt(j) - 'A';
            }
        }


        for (int i = 0; i < arr1; i++) {
            for (int j = 0; j < arr2; j++) {
                System.out.println("arr[i][j] = " + arr[i][j]);
            }
            System.out.println();
        }



        bfs(0,0);

        int max = 0;
        for (int i = 0; i < arr1; i++) {
            for (int j = 0; j < arr2; j++) {
                max =  Math.max(arrInt[i][j], max);

            }
        }
        System.out.println("max = " + max);


    }

    private static void  bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        while (!q.isEmpty()) {
            int[] node = q.poll();
            x = node[0];
            y = node[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= arr1 || ny < 0 || ny >= arr2) {
                    continue;
                }
                int s = arr[nx][ny];
                System.out.println("s = " + s);
                if (visited[s] == true) {
                    continue;
                }

                visited[s] = true;
                arrInt[nx][ny] = arrInt[x][y] + 1;
                System.out.println("s = " + s);
                q.add(new int[]{nx, ny});
            }

        }




    }
}
