import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int idx =0;
        Arrays.sort(numbers);
        int lastNum= numbers[numbers.length-1];
        for(int i=0; i<10; i++){
            if(i == lastNum){
                break;
            }
            
            if(numbers[idx]!= i){
                answer += i;
            }else{
                idx++;
            }
        }
        
        for(int i = lastNum+1; i< 10; i++){
            answer +=i;
        }
        
        return answer;
    }
}