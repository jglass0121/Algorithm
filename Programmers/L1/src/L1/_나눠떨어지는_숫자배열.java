package L1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class _나눠떨어지는_숫자배열 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        System.out.println(Arrays.toString(solution(arr, divisor)));
        ;
    }

    private static  int[]  solution(int[] arr, int divisor) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            int res = arr[i] % divisor;

            if (res == 0) {
                list.add(arr[i]);
            }

        }


        if (list.size() == 0) {
            return new int[]{-1};
        }
        Collections.sort(list);

        return  list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
