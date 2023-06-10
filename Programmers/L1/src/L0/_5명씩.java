package L0;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5명씩 {
    public static void main(String[] args) {

        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(solution(names)));

    }

    private static String[]  solution(String[] names) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.length; i+=5) {
            result.add(names[i]);
        }

        String[] answer = new String[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        //answer = result.toArray(new String[0]);



        return answer ;

    }
}
