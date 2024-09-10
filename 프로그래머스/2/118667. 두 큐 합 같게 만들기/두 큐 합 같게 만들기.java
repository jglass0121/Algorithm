import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
         Queue<Integer> queue_1 = new LinkedList<>();
        Queue<Integer> queue_2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0; // 큐의 합을 저장할 변수
        for (int num : queue1) {
            queue_1.add(num);
            sum1 += num;
        }

        for (int num : queue2) {
            queue_2.add(num);
            sum2 += num;
        }

        long target = (sum1 + sum2) / 2;
        int maxOperations = queue1.length * 3; // 최대 연산 수 제한

        int cnt = 0;
        while (cnt <= maxOperations) {
            if (sum1 == sum2) return cnt;

            if (sum1 > sum2) {
                if (!queue_1.isEmpty()) {
                    int value = queue_1.poll();
                    sum1 -= value;
                    sum2 += value;
                    queue_2.add(value);
                }
            } else {
                if (!queue_2.isEmpty()) {
                    int value = queue_2.poll();
                    sum2 -= value;
                    sum1 += value;
                    queue_1.add(value);
                }
            }
            cnt++;
        }

        return -1; // 두 큐의 합을 같게 만들 수 없는 경우
    }
}