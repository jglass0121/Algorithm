package bfs.실버1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 단지번호붙이기 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < num; j++) {
                int c = s.charAt(j)-'0';
                arr[i][j] = c;
            }
        }


        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[i][j] == 1) {
                    fac(arr,i,j);
                    res.add(cnt);
                    cnt = 0;
                }

            }
        }

        System.out.println(res.size());
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }


    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int cnt = 0;
    private static void fac(int[][] arr, int i, int j) {

        if (i < 0 || j < 0 || j >= arr.length || i >= arr.length) {
            return;
        }

        if (arr[i][j] == 1) {
            arr[i][j] = 0;
            cnt++;
            for (int k = 0; k < 4; k++) {
                int y = i + dy[k];
                int x = j + dx[k];
                fac(arr, y, x);
            }


        }

    }

}
