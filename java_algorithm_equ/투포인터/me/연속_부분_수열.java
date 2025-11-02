package me;

import java.util.Scanner;
//two point

public class 연속_부분_수열 {
    // start. end , sum ,res
    // while (start != N )
    // sum ==  M  , res ++
    // sum > M
    // sum < M
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        String[] str_M = sc.nextLine().split(" ");
        int[] arr = new int[str_M.length];
        for (int i = 0; i < str_M.length; i++) {
            arr[i] = Integer.parseInt(str_M[i]);
        }                                                    
        solution(N, M, arr);
    }
    // 총 3명

    private static int solution(int n, int m, int[] arr) {
        int answer = 0; int sum = 0; int lt = 0;
        for(int rt = 0; rt<n; rt++) {
            sum+= arr[rt];
            if(sum == m) {
                answer++;
            }
            while(sum >=m) {
                sum-=arr[lt++];
                if(sum == m) {
                    answer++;
                }
            }
        }

        return answer;



    }
}
