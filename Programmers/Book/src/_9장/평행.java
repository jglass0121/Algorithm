package _9장;

import java.sql.Array;
import java.util.*;

public class 평행 {
    public static void main(String[] args) {
        int[][] dots = {{1,1},{2,2},{3,3},{50,100}};

        System.out.println(solution(dots));
        ;

    }

    private static int solution(int[][] dots) {
        if (find(dots[0], dots[1]) == find(dots[2], dots[3])) {
            return 1;
        }
        if (find(dots[0], dots[2]) == find(dots[1], dots[3])) {
            return 1;
        }
        if (find(dots[0], dots[3]) == find(dots[1], dots[2])) {
            return 1;
        }
        return 0;

    }

    private static double find(int[] dot1, int[] dot2) {
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);

    }
}
