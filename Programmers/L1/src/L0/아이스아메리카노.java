package L0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 아이스아메리카노 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String replace = str.replace(",", "");
        System.out.println("replace = " + replace);
        int num = Integer.parseInt(replace);

        int[] solution = solution(num);
        System.out.println(Arrays.toString(solution));

    }

    public static  int[] solution(int money) {
        int[] answer = new int[2];
        int count;
        int q;
        count = money / 5500;
        q = money % 5500;
        answer[0] = count;
        answer[1] = q;


        return answer;
    }

}
