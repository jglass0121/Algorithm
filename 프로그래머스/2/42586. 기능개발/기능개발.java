import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
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