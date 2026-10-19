package dp;

import java.util.*;

public class 도둑질_DFS {
    static int maxMoney = 0;
    static Map<Integer, Set<Integer>> forbiddenMap = new HashMap<>();

    public static void main(String[] args) {
        int[] money = {1, 2, 3, 1};
        int n = money.length;

        // 1. Map에 각 집별 인접해서 못 가는 집 번호 등록
        for (int i = 0; i < n; i++) {
            forbiddenMap.put(i, new HashSet<>());
            forbiddenMap.get(i).add((i - 1 + n) % n); // 이전 집
            forbiddenMap.get(i).add((i + 1) % n);     // 다음 집
        }

        // 2. 각 기준 집(i)부터 시작해서 DFS 탐색
        for (int i = 0; i < n; i++) {
            Set<Integer> cannotRob = new HashSet<>();
            cannotRob.add(i);
            cannotRob.addAll(forbiddenMap.get(i)); // i번 집과 그 인접 집들은 방문 금지

            dfs(i, money[i], cannotRob, money);
        }

        System.out.println("최대 금액: " + maxMoney);
    }

    private static void dfs(int currentHouse, int currentSum, Set<Integer> cannotRob, int[] money) {
        maxMoney = Math.max(maxMoney, currentSum);

        // 다음으로 털 집 탐색
        for (int next = 0; next < money.length; next++) {
            // 못 가는 집(인접했거나 이미 턴 집)이면 패스
            if (cannotRob.contains(next)) continue;

            // 다음 집을 털기로 결정 -> 금지 목록 확장
            Set<Integer> nextCannotRob = new HashSet<>(cannotRob);
            nextCannotRob.add(next);
            nextCannotRob.addAll(forbiddenMap.get(next));

            dfs(next, currentSum + money[next], nextCannotRob, money);
        }
    }
}