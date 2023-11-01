package L1;

import java.util.Arrays;
import java.util.LinkedList;

public class _x만큼_간격 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(x, n)));
    }

    private static int[] solution(int x, int n) {
        int[] answer = new int[n];
        int num = x;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
