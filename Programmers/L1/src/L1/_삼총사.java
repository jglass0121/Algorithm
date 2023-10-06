package L1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _삼총사 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number));
    }

    private static int solution(int[] number) {
        Arrays.sort(number);

        int answer = 0;
        for (int i = 0; i < number.length-2; i++) {
            for (int j = i+1; j < number.length-1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }

                }
            }
        }
        return answer;


    }
}
