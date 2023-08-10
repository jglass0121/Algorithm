package L1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운글자 {

    public static void main(String[] args) {

    String s = "foobar";
    solution(s);
    }

    private static int[] solution(String s) {
        String[] split = s.split("");
        HashMap<String,Integer> map = new HashMap();
        int[] result = new int[s.length()];
        for (int i = 0; i < split.length; i++) {
            if (!map.containsKey(split[i])) {
                result[i] = -1;
                map.put(split[i], i);
                continue;
            }

            Integer integer = map.get(split[i]);
            int cnt = i - integer;
            result[i] = cnt;
            map.put(split[i], i);
        }

        return result ;

    }
}
