package L1;

public class _이진_변환_반복하기 {
    public static void main(String[] args) {
        String s = "110010101001";
        solution(s);
    }

    private static int[] solution(String s) {
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
