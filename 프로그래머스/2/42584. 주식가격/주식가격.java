import java.util.*;
class Solution {
    public int[] solution(int[] price) {
   Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{price[0], 0});
        int[] answer = new int[price.length];

        for (int i = 1; i < price.length; i++) {
            int now = price[i];
            while (!stack.isEmpty() && stack.peek()[0] > now) {
                int dif = i - stack.peek()[1];
                answer[stack.peek()[1]] = dif;
                stack.pop();
            }
            stack.push(new int[]{now, i});
        }



        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            int idx = pop[1];
            int i = (price.length - 1) - idx;
            answer[idx] = i;
        }


        return answer;   
    
    }
}