class Solution {
    public int solution(int[] numbers, int target) {
        //플러스 마이너스
        fac(numbers,target,0,0);
        return answer;
    }
    static int answer = 0;
    void fac(int[] numbers, int target,int idx,int res){
        // base 
        if(numbers.length == idx){
            if(res == target) answer++;
            return;
        }
        
        fac(numbers,target,idx+1,res+numbers[idx]);
        fac(numbers,target,idx+1,res-numbers[idx]);
        
    }
}