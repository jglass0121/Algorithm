import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i =0 ; i < commands.length; i++){
            int from = commands[i][0]-1;
            int to = commands[i][1];
            int num = commands[i][2];
            int[] arr = Arrays.copyOfRange(array,from,to);
            Arrays.sort(arr);
            answer[i] = arr[num-1];
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}