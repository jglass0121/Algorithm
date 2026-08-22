package L1;

import java.util.Arrays;

public class _모의고사 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        solution(answers);
    }

    private static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};

        int[] tree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] res = new int[3];
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if(one[i % one.length] == answer) res[0]++;
            if(two[i % two.length] == answer) res[1]++;
            if(tree[i % tree.length] == answer) res[2]++;
        }

        int max = Math.max(Math.max(res[0], res[1]), res[2]);

        String answer = "";
        for (int i = 0; i < res.length; i++) {
            if (max == res[i]) {
                answer += i + 1;
            }
        }

        int[] arr = Arrays.stream(answer.split("")).mapToInt(Integer::valueOf).toArray();
        return arr;

    }
}
