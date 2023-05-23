import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Mirror
{
    public static void main(String[] args) {
        //시작 지점
         int  startRow = 0;
         int startCol = 0;

        //도착지점
         int GoalRow = 7;
         int GoalCol = 4;

         int[][] in ={
                {0, 0, 0, 1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1},
                {1, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1, 1, 0}
        };

        int block = 0;
        int visited = 1;
        int path =2;
        int[][] Visit =new int[startRow][startCol];






    }
}
