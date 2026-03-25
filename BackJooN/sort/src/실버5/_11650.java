package 실버5;

import java.util.Arrays;
import java.util.Scanner;

public class _11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        solution(arr);
    }

    private static void solution(int[][] arr) {
        Arrays.sort(arr,(a,b)->{
            if(a[0] == b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]+" "+arr[i][1]);
            System.out.println();
        }
    }
}
