import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
         Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        int index = 0;

        // 초기에는 다리 길이만큼 0으로 채워둠
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (index < truck_weights.length) {
            time++;
            
            // 한 칸 이동: 맨 앞 트럭 빠져나감
            currentWeight -= bridge.poll();

            // 다음 트럭 다리에 올릴 수 있으면
            if (currentWeight + truck_weights[index] <= weight) {
                bridge.add(truck_weights[index]);
                currentWeight += truck_weights[index];
                index++;
            } else {
                // 못 올리면 빈 칸 추가
                bridge.add(0);
            }
        }

        // 마지막 트럭이 다리 끝까지 지나가는 시간 더하기
        time += bridge_length;
        return time;
    }
}