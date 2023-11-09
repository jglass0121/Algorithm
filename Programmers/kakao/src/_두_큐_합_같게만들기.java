import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _두_큐_합_같게만들기 {
    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        System.out.println(solution(queue1, queue2));
        ;

    }

    private static int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = getSum(queue1);
        long sum2 = getSum(queue2);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }


        while (sum1 != sum2) {
            if (answer > (queue1.length + queue2.length) * 2) {
                return -1;
            }

            int val = 0;
            if (sum1 < sum2) {
                val = q2.poll();
                q1.add(val);
                sum1 += (long) val;
                sum2 -= (long) val;
            } else if (sum1 > sum2) {
                val = q1.poll();
                q2.add(val);
                sum1 -= (long) val;
                sum2 += (long) val;
            } else {
                return answer;
            }
            answer++;

        }

        return answer;



    }

    private static long getSum(int[] queue) {
        return Arrays.stream(queue).sum();
    }
}
