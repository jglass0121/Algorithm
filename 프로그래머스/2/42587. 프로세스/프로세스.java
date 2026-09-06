import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
     // [우선순위, 원본 인덱스]를 담는 큐
        Queue<int[]> queue = new LinkedList<>();
        // 우선순위 최댓값을 빠르게 꺼내기 위한 내림차순 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
            pq.add(priorities[i]);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            // 현재 프로세스가 대기열 중 가장 높은 우선순위인 경우
            if (now[0] == pq.peek()) {
                pq.poll();
                answer++;

                if (now[1] == location) {
                    return answer;
                }
            } else {
                queue.add(now);
            }
        }

        return answer;
    }
}