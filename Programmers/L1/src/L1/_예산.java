package L1;

import java.util.Arrays;

public class _예산 {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }

    private static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            budget-=d[i];
            if (budget < 0) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
