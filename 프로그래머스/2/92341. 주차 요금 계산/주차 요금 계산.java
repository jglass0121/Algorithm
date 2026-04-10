import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
                // IN 기록 저장
        Map<String, Integer> inMap = new HashMap<>();

        // 차량별 누적 시간
        Map<String, Integer> totalMap = new HashMap<>();

        for (String record : records) {
            String[] s = record.split(" ");
            int time = minutes(s[0]);
            String car = s[1];
            String type = s[2];

            if (type.equals("IN")) {
                inMap.put(car, time);
            } else {
                int inTime = inMap.get(car);
                int stay = time - inTime;

                totalMap.put(car, totalMap.getOrDefault(car, 0) + stay);
                inMap.remove(car);
            }
        }

        // 출차 안 한 차량 처리 (23:59)
        int endTime = 23 * 60 + 59;
        for (String car : inMap.keySet()) {
            int stay = endTime - inMap.get(car);
            totalMap.put(car, totalMap.getOrDefault(car, 0) + stay);
        }

        // 차량 번호 정렬
        List<String> cars = new ArrayList<>(totalMap.keySet());
        Collections.sort(cars);

        // 결과 배열
        int[] answer = new int[cars.size()];

        for (int i = 0; i < cars.size(); i++) {
            int totalTime = totalMap.get(cars.get(i));
            answer[i] = calculateFee(totalTime, fees);
        }

        return answer;
    }

    private static int calculateFee(int time, int[] fee) {
        int baseTime = fee[0];
        int baseFee = fee[1];
        int unitTime = fee[2];
        int unitFee = fee[3];

        if (time <= baseTime) {
            return baseFee;
        }

        int extra = time - baseTime;
        int unit = (int) Math.ceil((double) extra / unitTime);

        return baseFee + unit * unitFee;
    }

    private static int minutes(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

}
