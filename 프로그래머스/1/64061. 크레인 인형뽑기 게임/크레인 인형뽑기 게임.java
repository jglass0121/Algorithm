import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack stack = new Stack<Integer>();
        int answer = 0;
        int pick = 0;
        int len = board.length;
        for(int i =0;i<moves.length;i++){
            int val = moves[i]-1;
            // 꺼낸다
            for(int j= 0 ; j < board.length ; j++){
                pick = 0;
                System.out.println();
                if(board[j][val] != 0 ){
                    pick = board[j][val];
                    board[j][val] =0;
                    break;
                }
            }

            //
            if(pick != 0){
                if(stack.isEmpty()){
                    stack.push(pick);
                    continue;
                }else{
                    if(stack.peek().equals(pick)){
                        answer+=2;
                        stack.pop();
                    }else{
                        stack.push(pick);
                    }
                }
            }
        }


        return answer;
    }
}