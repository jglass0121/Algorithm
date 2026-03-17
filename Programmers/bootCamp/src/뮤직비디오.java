import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        solution(M, arr);
    }

    private static void solution(int m, int[] arr) {
        int start = arr[arr.length - 1];
        int end = Arrays.stream(arr).sum();
        int answer =0;
        while (start <= end) {
            int mid = (start + end)/2;
            if(cnt(mid,arr) <= m ){
                answer = mid;
                end = mid-1;
            }else{
                start =mid+1;
            }
        }


        System.out.println(answer);
    }

    private static int cnt(int mid, int[] arr) {
        int cnt = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > mid) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
    return cnt;}
}
