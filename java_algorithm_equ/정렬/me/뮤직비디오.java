package me;

import java.util.Arrays;
import java.util.Scanner;

// 오답
public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(n, m, arr);
        System.out.println(solution);

    }

    private static int solution(int n, int m, int[] arr) {
        //1부터 시작해서 몇 개인지 확인

        // 최소 길이 구하기
        Arrays.sort(arr);
        for (int i = 1; i < 10000 ; i++) {
            int sum = 0;
            int cnt = 1;
            boolean isBig = true;

            for (int j = 0; j < arr.length; j++) {

                // 용량이 크다면 패스Q
                if(arr[j] > i) {
                    isBig =false;
                    break;
                }
                
                // 합한 값이

                    sum += arr[j];
                    if (i < sum) {
                        sum = arr[j];
                        cnt++;
                    }


            }
            if (isBig) {
                if (cnt == m) {
                    return i;
                }

            }

        }
        return 0;
    }
}
