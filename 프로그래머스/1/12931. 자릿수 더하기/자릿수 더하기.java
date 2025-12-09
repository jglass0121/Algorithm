import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN  = ""+n;
        String[] arr = strN.split("");
        for(int i=0; i< arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}