package 해시;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
        };

        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {

            String key = clothes[i][1];
            map.put(key, map.getOrDefault(clothes[i][1], 0) + 1);
        }

        int answer = 1;

        // 각 의상의 종류별로 입거나 입지 않는 경우의 수를 곱하기
        System.out.println("map = " + map);
        for (int value : map.values()) {
            answer *= (value + 1); // 해당 의상을 입지 않는 경우도 포함하기 위해 +1
        }

        // 모든 의상을 입지 않은 경우는 제외하므로 최종 결과에서 1을 빼주기
        return answer - 1;
    }
}
