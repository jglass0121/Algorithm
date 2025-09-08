import java.util.*;

public class Solution {
    public int[] solution(int []arr) {  int prev = arr[0];
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