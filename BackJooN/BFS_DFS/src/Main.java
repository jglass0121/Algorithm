import javax.management.QueryEval;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * DFS : 재귀함수, Stack
 * WFS : Queue
 *
 */

public class Main {
    //시작 지점
    static int  startRow = 0;
    static int startCol = 0;

    //도착지점
    static int GoalRow = 7;
    static int GoalCol = 4;

    //벽인지 구분
    static int nonblocked = 0; //뚫린 길
    static int blocked = 1; // 벽
    static int path = 2; // 맞는 길
    static int visited = 3;//방문함
    static  int count=0;


    static int width = 8;
    static int height = 8;
    static int[][] in ={
            {0, 0, 0, 1, 1, 0, 1, 0},
            {1, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1},
            {1, 1, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 1, 1, 0}
    };

    //방문여부를 위한
    static int[][] Visited = new int[width][height];



    public static void main(String[] args) {
        boolean push = push(startRow, startCol);
        System.out.println("push = " + push);
        trace();
        System.out.println("count = " + count);

    }

    private static boolean push(int r, int c) {


        if (Visited[r][c] == visited) {
            return false;
        }
        Visited[r][c] = visited;


        if (in[r][c] == blocked) {
            return false;
        }

        int tmp = in[r][c];
        in[r][c] = path;

        // 도착지에 도착했니?
        if (r == GoalRow && c == GoalCol) {
            count++;
            return true;
        }

        // 왼쪽 칸으로  push() 재실행(재귀호출)
        if (c > 0 && push(r, c - 1)) {
            count++;
            return true;
        }

        // 윗쪽 칸으로  push() 재실행(재귀호출)
        if (r > 0 && push(r - 1, c)) {
            count++;
            return true;
        }


        // 오른쪽 칸으로  push() 재실행(재귀호출)
        if (c < width-1 && push(r, c + 1)) {
            count++;
            return true;
        }


        // 아랫쪽 칸으로  push() 재실행(재귀호출)
        if (r < height-1 && push(r + 1, c)) {
            count++;
            return true;
        }


        in[r][c] = tmp;
        return false;
    }

    private static void trace() {
        System.out.println("trace");
        int i, j;
        for (int k = 0; k < width; k++) {
            for (int l = 0; l < height; l++) {
                if (in[k][l] == blocked) {
                    System.out.print(" ■ ");

                } else if (in[k][l] == path) {
                    System.out.print(" ☆ ");
                }
                else{
                    System.out.print(" □ ");
                }
            }
            System.out.print("\n");

        }

    }
}