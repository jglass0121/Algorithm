class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // 소문자로 변경
         s= s.toLowerCase();
        int pCnt =0; int yCnt = 0;
        for(int i=0; i<s.length(); i++){
            char val = s.charAt(i);
            if(val == 'p'){
                pCnt++;
            }else if(val =='y'){
                yCnt++;
            }
        }
        if(pCnt != yCnt){
            return false;
        }

        return true;
    }
}