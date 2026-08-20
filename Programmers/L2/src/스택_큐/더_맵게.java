package 스택_큐;

import java.util.PriorityQueue;

public class 더_맵게 {
    public static void main(String[] args) {
        int[] scoville = {10};
        int k = 7;
        solution(scoville, k);
    }

    private static int solution(int[] scoville, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }

        int count = 0;

        // 가장 안 매운 음식이 K 미만인 동안 계속 섞기
        while (pq.peek() < k) {
            // 더 이상 섞을 음식이 2개 미만이면 K 이상을 만들 수 없음
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();
            int mixed = first + (second * 2);
            pq.add(mixed);
            count++;
        }

        return count;
    }

}
