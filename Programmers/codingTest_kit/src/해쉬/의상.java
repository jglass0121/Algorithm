package 해쉬;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        solution(clothes);


    }

    private static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
             String[] clothe = clothes[i];
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);

        }

        Iterator<Integer> iterator = map.values().iterator();
        int ans = 1;
        while (iterator.hasNext()) {
            ans *= iterator.next().intValue() + 1;

        }
        return ans - 1;

    }
}
