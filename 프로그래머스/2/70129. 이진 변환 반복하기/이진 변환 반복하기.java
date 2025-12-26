class Solution {
    public int[] solution(String s) {
        // 0의 개수,
        int zeroCnt = 0;
        int idx = 0;

        while (!s.equals("1")) {

            // 1️⃣ 0 제거
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') zeroCnt++;
                else sb.append(c);
            }

            // 2️⃣ 길이를 이진수로 변환
            int len = sb.length();

            StringBuilder binary = new StringBuilder();
            while (len > 0) {
                binary.append(len % 2);
                len /= 2;
            }

            s = binary.reverse().toString();
            idx++;
        }

        return new int[]{idx, zeroCnt};
    }
}