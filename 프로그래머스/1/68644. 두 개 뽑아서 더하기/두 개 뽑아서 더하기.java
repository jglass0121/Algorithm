import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        HashSet<Integer> set =  new HashSet<Integer>();
        for(int i=0 ;i< numbers.length-1; i++ ){
            for(int j=i+1;j <numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            answer[idx++] = num;
        }

        Arrays.sort(answer); // 문제 요구사항: 오름차순

        return answer;
    }
}