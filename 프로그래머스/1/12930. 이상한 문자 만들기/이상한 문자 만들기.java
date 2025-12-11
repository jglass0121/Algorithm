class Solution {
    public String solution(String s) {
         String answer = "";
        int idx = 0; // 단어 내부 인덱스 (짝/홀)

        for (int i = 0; i < s.length(); i++) {
            char d = s.charAt(i);

            if (d == ' ') {
                answer += " ";
                idx = 0; // 단어 리셋
                continue;
            }

            if (idx % 2 == 0) { // 짝수
                answer += Character.toUpperCase(d);
            } else {            // 홀수
                answer += Character.toLowerCase(d);
            }
            idx++;
        }
        return answer;
        
        
    }
}