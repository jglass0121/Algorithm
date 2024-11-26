package th;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {
    // 연속된 수열
    // rt는 무조건 0만나면 1로변경
    //cnt가 k보다 클경우, lt가 증가하여 0으로 변경되었던 것을 1로 변경 (cnt감소)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(N, K, arr);
        System.out.println(solution);

    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt++;
            while (cnt > k) {  // 0의 개수가 k보다 클 경우
                if(arr[lt] == 0) cnt--; // lt는 1로 변경해서 cnt값 줄이고
                lt++; // 이동
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
}
