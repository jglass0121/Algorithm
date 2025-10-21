import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        int prev = arr[0];
        LinkedList<Integer> list =  new LinkedList<Integer>();
        for(int i =1; i<arr.length;i++){
            if(prev != arr[i]){
                list.add(prev);
                prev = arr[i];
            }
        }
        
     list.add(prev);
    return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        

    }
}