package 골드5;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 1; // right를 1로 초기화

        int res = Integer.MAX_VALUE;

        // right가 배열 길이를 벗어나지 않도록 체크
        while (right < N) {
            int diff = arr[right] - arr[left];

            // 차이가 M과 같다면 결과를 갱신하고 left와 right를 증가시킴
            if (diff == M) {
                res = M;
                left++;
                right++;
            }
            // 차이가 M보다 작으면 right를 증가시켜 더 큰 차이를 찾음
            else if (diff < M) {
                right++;
            }
            // 차이가 M보다 크면 left를 증가시켜 더 작은 차이를 찾음
            else {
                res = Math.min(res, diff);
                left++;
            }
        }

        // 결과 출력
        System.out.println(res);
    }
}
