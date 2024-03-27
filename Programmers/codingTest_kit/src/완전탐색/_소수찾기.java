package 완전탐색;

import java.util.HashMap;
import java.util.HashSet;

public class _소수찾기 {
    public static void main(String[] args) {
        String numbers = "17";
        solution(numbers);

    }

    private static void solution(String numbers) {

        HashSet<Integer> set = new HashSet<>();
        perm("", numbers, set,0);
    }

    private static void perm(String prefix, String str, HashSet<Integer> set,int cnt) {
        int n = str.length();
        if (!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }
        for (int i = cnt; i < n; i++) {
            String str1 = str.substring(0, i) + str.substring(i + 1, n);
            perm(prefix + str.charAt(i), str1, set,cnt+1);
        }


    }
}
