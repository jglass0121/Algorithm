package 다국어;

import java.util.Arrays;
import java.util.Scanner;

public class _10709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        Character[][] arr = new Character[H][W];
        for (int i = 0; i < H; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < W; j++) {
                arr[i][j] = str.charAt(j);

            }
        }

        solution(arr);
    }

    
    private static void solution(Character[][] arr) {
        //c를  -0 그후 +1 , c - 0  ,x  : -1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int cnt = -1;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals('c')) {
                    sb.append(0).append(" ");
                    cnt=0;
                }else{
                    if(cnt == -1){
                        sb.append(-1).append(" ");
                    }else{
                        cnt++;
                        sb.append(cnt).append(" ");
                    }
                }

            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
