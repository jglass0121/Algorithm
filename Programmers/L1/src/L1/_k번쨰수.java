package L1;

import java.util.Arrays;

public class _k번쨰수 {
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
        int j = 0;
        for (int[] command: commands) {
            int c = command[1] - command[0] + 1;
            int[] narr = new int[c];
            int idx = 0;
            for (int i = command[0] -1 ; i <= command[1] - 1; i++) {
                narr[idx]=  array[i];
                idx++;
            }
            Arrays.sort(narr);
            int i = narr[command[2]-1];
            answer[j] = i;
            j++;
        }

        return answer;
    }
}

