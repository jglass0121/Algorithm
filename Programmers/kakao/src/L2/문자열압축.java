package L2;

public class 문자열압축 {
    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";
        System.out.println(solution(s));
        ;

    }

    private static int solution(String s) {
        int answer = s.length();
        int count = 1;
        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder result = new StringBuilder();
            String base = s.substring(0, i);
            for (int j = i; j <= s.length(); j += i) {
                // 이미 base에서 하나는 count 했음 (j=i)
                int endIdx = Math.min(j + i, s.length());   // 인덱스는 길이를 넘을수 없음
                String compare = s.substring(j, endIdx);
                System.out.println("compare = " + compare);
                if (base.equals(compare)) { // base와 compare가 같은 값일 경우
                    count++;
                } else { // base와 compare가 다른 값일 경우
                    if (count >= 2) { // conunt가 2 이상일 경우
                        result.append(count);
                    }
                    result.append(base);
                    base = compare;     // 마지막 인덱스일때 한번 더 더해야함 (딱 안떨어지는 경우 있음)
                    count = 1;
                }
            }
            result.append(base);    // 마지막 문자 붙이기
            System.out.println("result.toString() = " + result.toString());
            answer = Math.min(answer, result.length());// 기존 문자열 길이와 새로 구한 길이 비교후 최솟값
        }

        return answer;
    }
}