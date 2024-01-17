package queue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        solution(bridge_length, weight, truck_weights);

    }

    private static int solution(int bridgeLength, int weight, int[] truckWeights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int sum = 0;
        for (int t : truckWeights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                } else if (q.size() == bridgeLength) {
                    sum -= q.poll();
                } else {
                    if (sum + t > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer+bridgeLength;



    }
}
