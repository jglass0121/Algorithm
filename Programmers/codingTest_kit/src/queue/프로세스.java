package queue;

import java.util.*;

public class 프로세스 {

    public static void main(String[] args) {
        int priorities[] = {1, 1, 9, 1, 1, 1};
        int location = 0;

        int solution = solution(priorities, location);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue);
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    System.out.println("queue.peek() = " + queue.peek());
                    System.out.println("priorities = " + priorities[i]);
                    queue.poll();
                    System.out.println("queue 12= " + queue);
                    answer++;
                    System.out.println("location = " + location);
                    System.out.println("i = " + i);
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }


        return answer;
    }

}
