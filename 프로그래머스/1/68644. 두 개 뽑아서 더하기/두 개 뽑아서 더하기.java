import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i =0 ; i <numbers.length-1; i++){
            for(int j =i+1; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
    int[] arr = set.stream()
               .mapToInt(Integer::intValue).sorted()
               .toArray();
        return arr;
    }
}