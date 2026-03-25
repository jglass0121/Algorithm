package 실버5;

import java.util.Arrays;
import java.util.Scanner;

public class _1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            int res = arr2[i];
            if (solution(res, arr)) {
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    private static boolean solution(int res, int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = (s+e)/2;
            if (arr[mid] == res) {
                return true;
            } else if (arr[mid] < res) {
                s =mid+1;
            }else{
                e = mid-1;
            }

        }
        return false;
    }
}
