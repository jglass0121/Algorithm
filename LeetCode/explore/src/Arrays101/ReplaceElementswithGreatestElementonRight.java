package Arrays101;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRight {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));

    }

    private static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }


        for (int i = 0; i < arr.length; i++) {

            int max = Integer.MIN_VALUE;
            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;


        return arr;
    }
}
