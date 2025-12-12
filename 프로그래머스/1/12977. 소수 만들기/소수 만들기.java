class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 3개 더하기
        // 소수가 되는지 확인
        // for문

        for(int i=0; i<nums.length-2;i++){
            for(int j =i+1;j<nums.length-1; j++){
                for(int k=j+1; k<nums.length;k++){
                    int sum =nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)){
                        answer+=1;
                    }
                }
            }
            
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
    
    public boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {			// n의 제곱근까지 나누기
        if (n % i == 0) return false;
    }
    return true;
}

}