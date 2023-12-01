import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class _4 {
    static int[][]arr ;
    static int num;
    static int cnt ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j)-'0';
            }
        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[i][j] == 1) {
                    cnt = 0;
                    if(check(i,j)){
                        list.add(cnt);
                    }

                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }

    private static boolean check(int y, int x) {
        if (x < 0 || y < 0 || x >= num || y >= num) {
            return false;
        }

        if (arr[x][y] == 1) {
            arr[x][y] = 0;
            check(y + 1, x);
            check(y -1, x);
            check(y, x+1);
            check(y , x-1);
            cnt++;
            return true;

        }
        return false;

    }
}
