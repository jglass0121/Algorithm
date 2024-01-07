package 해쉬;

import java.util.HashMap;
import java.util.Iterator;

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
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Iterator<Integer> it = map.values().iterator();
        int ans = 1;
        while (it.hasNext()) {
            ans *= it.next().intValue() + 1;
        }
        return ans -1;
    }
}
