package _7장;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class k번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        int[] solution = solution(array, commands);
        System.out.println(Arrays.toString(solution));;

    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j - 1]);
                Collections.sort(list);
            }
            answer[i]  = list.get(commands[i][2] - 1);
            list.clear();

        }


        return answer;
    }
}
