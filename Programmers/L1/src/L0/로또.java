package L0;

import java.util.Arrays;
import java.util.LinkedList;

public class 로또 {
    public static void main(String[] args) {
        Integer[] lottos = {44, 1, 0, 0, 31, 25};
        Integer[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] solution = solution(lottos, win_nums);
        System.out.println(Arrays.toString(solution));
    }
    // 0의 개수 파악
    //0이 아닌 기준으로 같은 번호가 있는지

    private static int[] solution(Integer[] lottos, Integer[] win_nums) {
        int zero = 0;
        int my = 0;
        for (int i : lottos){
            if (i == 0) {
                zero++;
            } else {
                for (int j :
                        win_nums) {
                    if (i == j) {
                    my++;
                    break;

                    }

                }
            }

        }

        int[] answer = new int[2];
        answer[0] = (my + zero) > 1 ? 7 - (my + zero) : 6;
        answer[1] = (my) > 1 ? 7 - (my) : 6;

        return answer;


    }
}
