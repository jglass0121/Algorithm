import java.util.Scanner;
import java.util.StringTokenizer;

public class _2178 {
    static int endRow;
    static int endCol;
    static int count;

    static int[][] Visited; //방문여부


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.println("a = " + a);

        int b = Integer.parseInt(st.nextToken());
        System.out.println("b = " + b);

        Visited = new int[a][b];

        int[][] arr = new int[a][b];



        int j = 0;
        for (int i = 0; i < a; i++) {
            StringTokenizer st2 = new StringTokenizer(sc.nextLine());
            String s = st2.nextToken();
            for (int k = 0; k < s.length(); k++) {
                arr[i][k] = Integer.parseInt(String.valueOf(s.charAt(k)));


            }



        }

        for (int i = 0; i < a; i++) {
            for (int k = 0; k < b; k++) {
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }


        //1 : 이동가능
        //0 : 이동 불가
        int startRow = 0;
        int startCol = 0;

        endRow = a - 1;
        endCol = b - 1;
        System.out.println("endRow = " + endRow);
        System.out.println("endCol = " + endCol);
        System.out.println("arr[endRow][endCol] = " + arr[endRow][endCol]);


        push(arr,startRow,startCol);


    }

    private static boolean push(int[][] arr, int r, int c) {


        //0인가?
        if (arr[r][c] == 0) {
            return false;
        }

        // 방문한 경험이 있는가?
        if (Visited[r][c] == 3) {
            return false;
        }

        //방문함
        Visited[r][c] = 3;


        //mirror
        int total = 0;
        int path = arr[r][c];

        if (arr[r][c] == 1) {
            total ++;

            return true;
        }

        return false;

    }

}
