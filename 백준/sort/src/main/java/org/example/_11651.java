package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        int swap;
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());


        }


        Arrays.sort(arr,(arr_1,arr_2)->{
            if (arr_1[1] == arr_2[1]) {
                return arr_1[0] - arr_2[0];
            } else {
                return arr_1[1] - arr_2[1];
            }
        });


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb);



    }
}
