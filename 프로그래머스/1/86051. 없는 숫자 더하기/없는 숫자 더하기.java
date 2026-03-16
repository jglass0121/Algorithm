import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = i;
        }
        
        Arrays.sort(numbers);
        
        int lt1=0, lt2=0;
        while(lt2 != numbers.length){
            
            if(arr[lt1] != numbers[lt2]){
                answer+=arr[lt1];
                lt1++;
                continue;
            }
            lt1++;
            lt2++;
        }

        for(int i=lt1;i<arr.length;i++){
            answer+=arr[i];
        }
        
        return answer;
    }
}