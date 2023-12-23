package 골드6;

import java.util.Scanner;

public class 부분합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int res = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = arr[0];

        while (left < N && right < N) {
            // ==일때 right++(x) -> 현재 부분합이 이미 S이상이기 때문에 right를 늘리면 부분합이 더 커질 뿐이며,
            //길이 최소화를 위해 left를 증가 시켜야함.
            if (sum >= S) {
                int len = right - left + 1;
                res = Math.min(res, len);
                sum -= arr[left];
                left++;
            } else {
                right++;
                if (right < N) {
                    sum += arr[right];
                }
            }
        }

        if (res == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(res);
        }
    }
}
