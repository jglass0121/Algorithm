package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스2 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        solution(priorities, location);
    }

    private static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        // {우선순위, 인덱스}
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int val = now[0];
            int idx = now[1];

            boolean hasHigher = false;

            // 현재 큐에 더 높은 우선순위 있는지 체크
            for (int[] arr : queue) {
                if (arr[0] > val) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                queue.add(now); // 뒤로 보냄
            } else {
                cnt++; // 실행

                if (idx == location) {
                    return cnt;
                }
            }
        }

        return cnt;
    }
}