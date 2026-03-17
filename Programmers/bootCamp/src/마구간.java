import java.util.Arrays;
import java.util.Scanner;

public class 마구간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        solution(arr, M);
    }

    static int max =-1;
    private static void solution(int[] arr, int m) {
        int start =1;
        int end = (arr[arr.length-1]-arr[0]) +1;
        int answer= 0;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (dis(mid, arr) == m) { // 가능하다 거기에서 더 가까운 최대값?
                answer = max;
                end  = mid-1;
            }else{
                start = mid+1;
            }
        }

        System.out.println(answer);
    }

    private static int dis(int distance, int[] arr) {
        int replace = arr[0];
        int cnt =1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - replace >distance){
                max = Math.max(arr[i] - replace, max);
                replace = arr[i];
                cnt++;
            }
        }

        return cnt;
    }
}
