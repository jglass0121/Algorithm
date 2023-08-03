package _7장;

import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] solution = solution(numbers);
        System.out.println(Arrays.toString(solution));

    }

    private static int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {

            for (int j = i+1; j < numbers.length; j++) {
                result.add( numbers[i] + numbers[j]);
            }
        }

        int[] answer = result.stream().sorted().mapToInt(i -> i.intValue()).toArray();
        return answer;


    }
}
