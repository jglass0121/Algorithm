import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        LinkedList list = new LinkedList<Integer>();
        list.add(arr[0]);
        int first = arr[0];
        for(int i = 1; i < arr.length; i++){
            int second = arr[i];
            if(first == second) continue;
            list.add(arr[i]);
            first = arr[i];
        }
return list.stream()
           .mapToInt(i -> ((Integer) i).intValue())  // Object를 Integer로 캐스팅
           .toArray();
    }
}