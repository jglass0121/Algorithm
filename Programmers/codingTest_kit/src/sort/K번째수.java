package sort;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };

        int[] solution = solution(array, commands);
        System.out.println(Arrays.toString(solution));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int arrayI = command[0];
            int arrayJ = command[1];
            int newSize = (arrayJ - arrayI) + 1;
            int[] new_array = new int[newSize];
            int k = 0;
            for (int j = arrayI-1; j <= arrayJ-1; j++) {
                new_array[k] = array[j];
                k++;
            }

            Arrays.sort(new_array);
            int res = new_array[(command[2] - 1)];
            answer[i] = res;
        }
        return answer;
    }
}

