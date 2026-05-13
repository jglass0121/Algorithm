package 투포인터;

import java.util.Arrays;

public class 연속부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        int[] solution = solution(sequence, k);

    }

    private static int[] solution(int[] sequence, int k) {
        int start = 0, end = 0;
        int len = Integer.MAX_VALUE;
        int[] answer = new int[2];

        int totalSum = sequence[start];

        while (end < sequence.length) {
            if (totalSum < k) {
                end++;
                if (end < sequence.length) {
                    totalSum += sequence[end];
                }
            } else if (totalSum == k) {
                int diff = end - start;
                if (diff < len) {
                    len = diff;
                    answer = new int[]{start, end};
                }
                totalSum -= sequence[start];
                start++;
            } else {
                totalSum -= sequence[start];
                start++;
            }
        }

        return answer;

    }
}
