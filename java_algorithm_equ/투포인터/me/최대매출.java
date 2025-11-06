package me;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;
// 시간 초과
public class 최대매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int sum =0l
        // int p1(start) 커서 p2(end) - 3까지 도릭
        // while (p2 = len-1 )

        String[] str = sc.nextLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int[] arr= new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]= sc.nextInt();
        }
        int K = Integer.parseInt(str[1]);
        int answer = 0;
        int p1=0;             int p2= 0;

        while (p1 < arr.length-K){
            int sum= 0;
            int cnt = 0;
            p2 = p1;
            while (cnt < K){
                sum += arr[p2];
                cnt++; p2++;
                answer = Math.max(sum,answer);
            }
            p1++;

        }
        System.out.println(answer);


    }
}
