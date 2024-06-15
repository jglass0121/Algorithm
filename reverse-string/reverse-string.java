import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
                solution(s);

    }
    
        private static void solution(char[] s) {
        fac(s, 0,s.length-1);
    }

    private static void fac(char[] s, int start,int end) {
        if(start>=end) return;
        //swap
        char temp = s[end]; // 마지막
        s[end] = s[start]; // 첫번째
        s[start] = temp;

        fac(s, start + 1, end-1);



    }
}