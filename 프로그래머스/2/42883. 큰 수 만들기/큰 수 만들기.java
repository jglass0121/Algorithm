import java.util.*;
class Solution {
    public String solution(String number, int k) {
        
        Stack<Character> stack =  new Stack<Character>();
        for(char num : number.toCharArray()){
            while (!stack.isEmpty() && k > 0 && stack.peek() < num) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }
        
        while(k-- > 0){
            stack.pop();
        }
        
                StringBuilder sb = new StringBuilder();
        
        for(char c : stack){
            sb.append(c);
        }
        
        return sb.toString();
    }
}