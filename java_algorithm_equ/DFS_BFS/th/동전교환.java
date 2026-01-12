package th;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Integer[] arr = new Integer[num];
        for (int i = 0; i < num; i++) {
            arr[i] =sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

       fac(arr,0,0,m);
        System.out.println(answer);

    }

    static int answer = Integer.MAX_VALUE;

    private static void fac(Integer[] arr, int depth, int sum, int m) {
        if(sum > m)return;
        if(depth >= answer) return;
        if(sum == m){
            answer= Math.min(answer,depth);
        }else{
            for (int i = 0; i < arr.length; i++) {
                fac(arr,depth+1,sum+arr[i],m);
            }

        }


    }
}
