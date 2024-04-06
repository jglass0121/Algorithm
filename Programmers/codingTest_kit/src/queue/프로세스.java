package queue;

import java.util.*;

public class 프로세스 {

    public static void main(String[] args) {
        int priorities[] = {1, 1, 9, 1, 1, 1};
        int location = 0;

        solution(priorities, location);
    }

    private static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }


        return answer;
    }

}
