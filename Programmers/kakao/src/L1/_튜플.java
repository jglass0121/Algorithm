package L1;

import java.util.*;
import java.util.stream.Collectors;

public class _튜플 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(solution(s));
    }

    private static ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2, s.length());
        s = s.substring(0, s.length() - 2).replace("},{", "-");
        String[] str = s.split("-");

        Arrays.sort(str, (o1, o2) -> {
            return o1.length() - o2.length();
        });

        for (String x : str) {
            String[] temp = x.split(",");
            for (int i = 0; i < temp.length; i++) {
                int n = Integer.parseInt(temp[i]);
                if (!answer.contains(n)) {
                    answer.add(n);
                }
            }
        }
            return answer;

    }
}
