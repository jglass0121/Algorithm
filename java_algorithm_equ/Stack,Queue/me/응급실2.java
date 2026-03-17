package me;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }

        System.out.println(solution(M, arr));

    }

    private static int solution(int m, int[] arr) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(new int[]{i,arr[i]});
        }

        int cnt =0;
        while (true){
            int[] now = queue.poll();
            boolean isBig =false;
            for (int[] next :queue){
                if(next[1] > now[1]){
                    isBig =true;
                }
            }
            if(isBig){
                queue.add(now);
            }else{
                cnt++;
                if(now[0] == m){
                    return cnt;
                }
            }

        }
    }
}
