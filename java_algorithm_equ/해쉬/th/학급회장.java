package th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class 학급회장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(br.readLine()));

    }

    private static char solution(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char result = 0;
        int max = 0;
        for (char c : str.toCharArray()) {
            int count = map.getOrDefault(c, 0) + 1;
            map.put(c, count);
            if (count > max) {
                max = count;
                result = c;
            }
        }
        return result;
    }
}
