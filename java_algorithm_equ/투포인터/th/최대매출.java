package th;

import java.util.Scanner;
//슬라이스 윈도우
public class 최대매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int N = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        String[] str2 = sc.nextLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }

        int solution = solution(N, k, arr);
        System.out.println(solution);
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) { // 미리 k개까지 합을 구하기
            sum += arr[i];
        }
        answer = sum;
        for (int j = k; j < n; j++) {
            sum += (arr[j] - arr[j - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
