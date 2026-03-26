import java.util.*;
class Solution {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
       
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        for (int i = 0; i < truckWeights.length; i++) {
            queue.add(truckWeights[i]);
        }

        // 다리 초기화
        for (int i = 0; i < bridgeLength; i++) {
            bridge.add(0);
        }

        int cnt = 0;
        int totalWeight = 0;

        while (!queue.isEmpty()) {
            cnt++;

            // 1️⃣ 다리에서 하나 빠짐
            totalWeight -= bridge.poll();

            Integer nextCar = queue.peek();

            // 2️⃣ 다음 트럭 올릴 수 있는지 확인
            if (totalWeight + nextCar <= weight) {
                Integer next = queue.poll();
                bridge.add(next);
                totalWeight += next;
            } else {
                bridge.add(0);
            }
        }

        // 남은 다리 길이만큼 시간 추가
        cnt += bridgeLength;

        return cnt;
    }
}