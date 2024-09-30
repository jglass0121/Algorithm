import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
class Solution {
    public long solution(long n) {
              String answer = "";
        String str = Long.toString(n);
        String[] split = str.split("");
        Arrays.sort(split, Collections.reverseOrder());
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            answer += split[i];
        }
        
        return Long.parseLong(answer);

    
    }
}