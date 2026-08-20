package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10};
        solution(bridge_length, weight, truck_weights);
    }

    private static int solution(int bridgeLength, int weight, int[] truckWeights) {

        Queue<Integer> bridge = new LinkedList<>();

        // 다리 길이만큼 0으로 초기화
        for (int i = 0; i < bridgeLength; i++) {
            bridge.add(0);
        }

        int time = 0;
        int currentWeight = 0;
        int truckIdx = 0;

        // 대기 트럭이 남아있는 동안 반복
        while (truckIdx < truckWeights.length) {
            time++;

            // 1. 매 초마다 다리 맨 앞 요소가 빠져나옴
            currentWeight -= bridge.poll();

            // 2. 다음 트럭이 올라갈 수 있는지 확인
            int nextTruck = truckWeights[truckIdx];
            if (currentWeight + nextTruck <= weight) {
                bridge.add(nextTruck);
                currentWeight += nextTruck;
                truckIdx++; // 트럭 다리에 진입 성공
            } else {
                bridge.add(0); // 무게 초과로 못 올라가면 빈 공간(0) 추가
            }
        }

        // 마지막 트럭이 다리에 진입한 시점에서, 완전히 건너는 데 걸리는 다리 길이(bridgeLength)를 더함
        return time + bridgeLength;

    }
}
