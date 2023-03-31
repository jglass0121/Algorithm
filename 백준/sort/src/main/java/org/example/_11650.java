package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]  = Integer.parseInt(st.nextToken());
            arr[i][1]  = Integer.parseInt(st.nextToken());

        }

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0]==o2[0]){
//                    return o1[1]-o2[1];
//                }else{
//                    return o1[0]-o2[0];
//
//                }
//
//            }
//        });

        Arrays.sort(arr,(a,b) ->{
                    if (a[0] == b[0]) {
                        return a[1] - b[1];
                    } else {
                        return a[0] - b[0];
                    }
        }
        );


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.println(sb.toString());



    }

}
