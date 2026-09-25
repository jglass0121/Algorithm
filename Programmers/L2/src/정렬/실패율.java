package 정렬;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] solution = solution(N, stages);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

    private static int[] solution(int N, int[] stages) {
        // 1. 스테이지별 머물러 있는 플레이어 수 카운트 (N+1 스테이지까지 포함)
        int[] stageCounts = new int[N + 2];
        for (int stage : stages) {
            stageCounts[stage]++;
        }

        int totalPlayers = stages.length;

        // 2. 스테이지 번호와 실패율을 저장할 리스트
        List<double[]> failRates = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                // 도달한 유저가 없는 경우 실패율은 0
                failRates.add(new double[]{i, 0.0});
            } else {
                // 실패율 계산: (현재 스테이지에 머문 사람) / (스테이지에 도달한 전체 사람)
                double rate = (double) stageCounts[i] / totalPlayers;
                failRates.add(new double[]{i, rate});

                // 다음 스테이지 도달 인원 계산을 위해 현재 스테이지 인원 차감
                totalPlayers -= stageCounts[i];
            }
        }

        // 3. 실패율 내림차순, 같으면 스테이지 오름차순 정렬
        failRates.sort((a, b) -> {
            if (Double.compare(b[1], a[1]) == 0) {
                return Double.compare(a[0], b[0]); // 실패율이 같으면 스테이지 번호 오름차순
            }
            return Double.compare(b[1], a[1]);     // 실패율 내림차순
        });

        // 4. 정렬된 결과에서 스테이지 번호만 추출
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failRates.get(i)[0];
        }

        return answer;
    }
}