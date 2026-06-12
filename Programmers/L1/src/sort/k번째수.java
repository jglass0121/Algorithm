package sort;

import java.util.Arrays;

public class k번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };

        solution(array, commands);
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int start = command[0];
            int end = command[1];
            int k = command[2];



            int[] arr = new int[(end - start) + 1];
            int idx = 0;

            for (int j = start; j <= end; j++) {
                arr[idx++] = array[j-1];
            }

            Arrays.sort(arr);
            answer[i] = arr[k - 1];
        }

        return answer;
    }
}
