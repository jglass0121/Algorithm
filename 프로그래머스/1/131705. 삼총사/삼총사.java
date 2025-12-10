class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 세 수를 더해서 0이 아
        //3중 for문 - 투포인터 
        int one =0 ; int two =one+1; int three =two+1;
        int sum = 0;
        for(int i =0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    int all = number[i]+number[j]+number[k];
                    System.out.println("all :"+all);
                    if(number[i]+number[j]+number[k] == 0){
                        sum++;
                    }
                    
                }
            }
        }
        
        
        return sum;
    }
}