import java.util.*;
class Solution {
    // 전체합, 길이, 오른쪽 커서, 왼쪽 커서
    // 길이가 짧은지 비교
    //k보다 작으면 왼쪽 ++
    // k보다 크면 오른쪽 ++
    // k일 경우 비교
    public int[] solution(int[] sequence, int k) {

        int sum = sequence[0];
        if(sum == k){
            return new int[]{0,0};
        }
        int lt = 0;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];
        
        for(int rt=1;rt<sequence.length;rt++){
            sum += sequence[rt];
            int cnt = rt-lt+1;
            if(sum == k){
                if(min > cnt){
                    min = cnt;
                    answer[0] = lt;
                    answer[1] = rt;
                }
                cnt=0;
            }
            
            
            while(sum >= k){
                sum -= sequence[lt++];
                cnt--;
                if(sum == k){
                    if(min > rt-lt+1){
                        
                        min = cnt;
                        answer[0] = lt;
                        answer[1] = rt;
                        cnt=0;
                    }
                }
            }
        
        }
        
        return answer;
    }
}