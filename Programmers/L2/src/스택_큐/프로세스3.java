package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 프로세스3 {

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println("실행 순서: " + solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        // 1. Queue 초기화: [우선순위, 원래 인덱스]
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        int cnt = 0; // 실행된 프로세스 수

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowPriority = now[0];
            int nowIdx = now[1];

            // 2. 큐에 현재 프로세스보다 우선순위가 높은 프로세스가 있는지 확인
            if (hasHigherPriority(queue, nowPriority)) {
                // 더 높은 우선순위가 있다면 다시 큐의 맨 뒤에 넣음
                queue.add(now);
            } else {
                // 가장 높은 우선순위라면 프로세스 실행 (출력)
                cnt++;

                // 찾고자 하는 위치의 프로세스인 경우 실행 순서 반환
                if (nowIdx == location) {
                    return cnt;
                }
            }
        }

        return cnt;
    }

    // 큐 내에 currentPriority보다 더 높은 우선순위를 가진 프로세스가 존재하는지 확인
    private static boolean hasHigherPriority(Queue<int[]> queue, int currentPriority) {
        for (int[] process : queue) {
            if (process[0] > currentPriority) {
                return true; // 더 높은 우선순위 존재
            }
        }
        return false;
    }
}