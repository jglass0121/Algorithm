package L1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class k번쨰수_1 {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };

        solution(array, commands);

    }

    private static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int k = command[2];

            int[] arr = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(arr);
            answer[idx] = arr[k-1];
            idx++;
        }



        return answer;
    }
}
