class Solution {
    public int[] solution(String s) {
       int zeroCnt = 0;
    int idx = 0;

    while (!s.equals("1")) {
        int beforeLen = s.length();

        // 1️⃣ 0 제거
        s = s.replaceAll("0", "");

        // 제거된 0 개수
        zeroCnt += beforeLen - s.length();

        // 2️⃣ 길이를 이진수로 변환
        s = Integer.toBinaryString(s.length());

        idx++;
    }

    return new int[]{idx, zeroCnt};
    }
}