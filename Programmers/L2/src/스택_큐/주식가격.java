package 스택_큐;

import java.util.*;
import java.util.stream.Collectors;

public class 주식가격 {
    public static void main(String[] args) {
        int[] prices = {3, 2, 4, 1, 1};
        solution(prices);

    }

    private static int[] solution(int[] prices) {

        int len = prices.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;


    }
}
