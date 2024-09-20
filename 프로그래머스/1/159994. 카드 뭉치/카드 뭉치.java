import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue queue1= new LinkedList();
        Queue queue2= new LinkedList();
        for(int i = 0;i<cards1.length; i++) queue1.add(cards1[i]);
        for(int i = 0; i<cards2.length; i++) queue2.add(cards2[i]);
        
        String answer = "Yes";

        for(int i = 0; i<goal.length; i++) {
            String res = goal[i];
            System.out.println("res : "+res);
            if(!queue1.isEmpty()){
                if(queue1.peek().equals(res)) {queue1.poll(); continue;}
            }
            if(!queue2.isEmpty()){
                if(queue2.peek().equals(res)) {queue2.poll(); continue;}
            }
            return "No";
        }
        
        
        
        
        
        return answer;
    }
}