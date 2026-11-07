import java.util.*;
class Solution {
    public int solution(String s) {
if (s.length() == 1) return 1;

        int min = Integer.MAX_VALUE;
        
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            int cnt = 1;
            String ori = s.substring(0, i);
            
            // [수정 1] j++ 가 아니라 j += i 로 뭉텅이로 건너뛰어야 함
            for (int j = i; j < s.length(); j += i) {
                String sub = s.substring(j, Math.min(j + i, s.length()));
                
                if (ori.equals(sub)) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(ori);
                    
                    ori = sub;
                    cnt = 1;
                }
            }

            // [수정 2] for문이 다 끝난 뒤, 마지막으로 남은 뭉텅이를 처리
            if (cnt > 1) {
                sb.append(cnt);
            }
            sb.append(ori);

            String string = sb.toString();
            min = Math.min(min, string.length());
        }

        return min;    }
}