package L1;

import java.util.*;

public class 대충_만든_자판 {
    public static void main(String[] args) {
        //1번 없으면 2번으로 indexOf
        String[] keymap = {"ABACD", "BCEFD"};
        String[] target = {"ABCD", "AABB"};
        solution(keymap, target);
    }

    private static int[] solution(String[] keymap, String[] target) {

        HashMap<Character, Integer> hm = new HashMap<>();
        int[] ret = new int[target.length];

        for (String key :keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                System.out.println("c = " + c);
                if (!hm.containsKey(c) || i < hm.get(c)) { //1 < 2
                    hm.put(c, i + 1); // B 2
                }
            }
        }
        System.out.println("hm = " + hm);
        for (int i = 0; i < target.length; i++) {
            int cnt = 0;
            for (int j = 0; j < target[i].length(); j++) {
                char c = target[i].charAt(j);
                if (!hm.containsKey(c)) {
                    cnt = 0;
                    break;
                } else {
                    cnt += hm.get(c);
                }
            }
            System.out.println("cnt = " + cnt);
            ret[i] = cnt == 0 ? -1 : cnt;
        }

        System.out.println(Arrays.toString(ret));
        return ret;


    }
}
