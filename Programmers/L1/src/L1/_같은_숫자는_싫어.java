package L1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    private static   int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);
        int pre = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (pre != arr[i]) {
                list.add(arr[i]);
                pre = arr[i];
            }
            continue;

        }

        return list.stream().mapToInt(i->i.intValue()).toArray();

    }
}
