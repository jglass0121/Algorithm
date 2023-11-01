package _backTracking;

import java.util.Arrays;
import java.util.Scanner;

public class _1182 {
    static int N,S, cnt=0;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();

        sc.nextLine();
        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
         dfs(0, 0);

        // 만약 합이 0인 경우 공집합도 포함되므로, 공집합을 뺀다.
        if (S == 0) {
            cnt--;
        }

        System.out.println( cnt);
    }

    private static void dfs(int depth, int sum) {

        if (depth == N) { //배열 모두 탐색
            if (sum == S) {
                cnt++;
            }
            return;
        }
        // 현재 원소를 포함하는 경우
        dfs(depth + 1, sum + arr[depth]);

        // 현재 원소를 포함하지 않는 경우
        dfs(depth + 1, sum );


    }
}
