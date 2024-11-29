package th;

import java.util.HashMap;
import java.util.Scanner;


public class 아나그램 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        solution(one, two);
    }

    private static String solution(String one, String two) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : one.toCharArray()) {
            map.put(x, map.getOrDefault(map.get(x), 0) + 1);
        }


        for (char x : two.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            } else {
                map.put(x, map.get(x) - x);
            }
        }
        return answer;
    }
}
