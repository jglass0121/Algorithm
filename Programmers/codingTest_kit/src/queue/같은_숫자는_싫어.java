package queue;

import java.util.Arrays;
import java.util.LinkedList;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        // int compare  ,
        // 같은 숫자일 경우, continue, 아닐경우 list.add
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    private static  int[] solution(int[] arr) {
        int prev = arr[0];
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (prev != arr[i]) {
                prev = arr[i];
                list.add(arr[i]);
            }
        }

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }

}
