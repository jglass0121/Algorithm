package me;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//queue
//위험도 높은 환자 존재시 뒤로
// 번째 환자
// 문제 컴파일 에러 발생
public class 응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(num, m, arr);
        System.out.println(solution);


    }

    private static int solution(int num, int m, int[] arr) {
        //q.add 2개 {위험도, idx}, cnt
        //for(1~N)
        // 1. 위험도가 가장 높은지 체크 후 poll , cnt++
        // 2. idx 확인하여 찾고자하는 수인지

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(new int[]{arr[i], i});
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            int[] info = queue.poll();
            int pa = info[0];

            // 위험도가 가장 높은지 check
            boolean isDanger = false;
            for (int[] q : queue) {
                if (q[0] > pa) {
                    isDanger = true;
                    break;
                }
            }


            //위험도가 높은 사람이 있는 경우
            if (isDanger) {
                queue.add(info);
            } else {
                cnt++;
                if (info[1] == m) {
                    return cnt;
                }
            }

        }

        return cnt;

    }
}
