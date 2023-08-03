package _6장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};
        solution(answer);
    }

    private static int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answer = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int result = answers[i];
            int one = i%arr1.length;
            int two = i%arr2.length;
            int tree = i%arr3.length;
            if (result == arr1[one]) {
                answer[0]++;

            }if (result == arr2[two]) {
                answer[1]++;
            }if (result == arr3[tree]) {
                answer[2]++;
            }
        }
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (max == answer[i]) {
                list.add(i + 1);
            }
        }
        int[] array = list.stream().mapToInt(i -> i.intValue()).toArray();
        return array;
    }
}
