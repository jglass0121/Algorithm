package th;


import java.util.Scanner;

public class 연속_부분_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer =0,  sum =0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) answer++;
            while (sum >= m) { //합이 크커가 같다면
                sum -= arr[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
 }
