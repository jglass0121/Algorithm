package me;

import java.util.Scanner;
//g
public class 최대_매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int one = Integer.parseInt(nums[0]);
        int two = Integer.parseInt(nums[1]);

        int[] arr = new int[one];
        for (int i = 0; i < one; i++) {
            arr[i] = sc.nextInt();
        }


        int max = -1;
        for (int i = 0; i < one-two; i++) {
            int cnt = 0;
            int sum = 0;
            sum += arr[i];
            max = Math.max(max, sum);
            cnt++;
            if(cnt == two) break;

        }
        

    }
}
