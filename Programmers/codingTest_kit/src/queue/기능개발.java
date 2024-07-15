package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue
 * 
 */

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        solution(progresses,speeds);
    }

    private static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int now = 100 - progress;
            int day = now / speed;
            int divide = now % speed;
            if (divide != 0) { // 나머지가 있을 경우
                day += 1; // 추가
            }
            queue.add(day);
        }

        int cnt = 1;
        int first = queue.poll();
        Queue<Integer> res = new LinkedList<>();
        while (!queue.isEmpty()) {
            Integer nowValue = queue.peek();
            if (first >= nowValue) { // 증가
                queue.poll();
                cnt++;
            }
            if (first < nowValue) {
                res.add(cnt);
                first = queue.poll();
                cnt = 1;
            }

        }
        res.add(cnt);
        return res.stream().mapToInt(i -> i.intValue()).toArray();



    }
}
