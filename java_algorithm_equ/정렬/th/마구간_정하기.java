package th;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간_정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,c,arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while (lt < rt) {
            int mid = (lt+rt)/2;
            if(count(arr,mid) >= c){ //설치 가능 -
                answer = mid;
                lt = mid+1;
            }else{ // 설치 부족
                rt = mid-1;
            }
        }

        return answer;
    }

    private static int count(int[] arr, int dis) {
        int cnt =1;
        int ep  =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]-ep >= dis){
                cnt++;
                ep=arr[i];
            }
        }

        return cnt;
    }
}
