package queue;

import java.util.LinkedList;
import java.util.Queue;

//큐
public class 다리를_지나는_트럭 {
    public static void main(String[] args) {
        int bridge_length  =2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        solution(bridge_length, weight, truck_weights);

    }

    private static void solution(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < truckWeights.length; i++) {
            queue.add(truckWeights[i]);
        }

    }
}
