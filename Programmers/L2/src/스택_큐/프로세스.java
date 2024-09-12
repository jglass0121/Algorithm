package 스택_큐;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int solution = solution(priorities, location);
        System.out.println("solution = " + solution);

    }

    private static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        // 우선순위 큐에 우선순위 요소 추가
        for (int i : priorities) {
            queue.offer(i);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    // 현재 작업이 location과 같으면 answer 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;

    }
}
