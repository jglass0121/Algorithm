package String;

public class AddBinary {
    public static void main(String[] args) {

        String a = "11";
        String b = "1";
        solution(a, b);

    }

    private static String solution(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += a.charAt(j--) - '0';

            result.insert(0, sum % 2); //계산된 합의 나머지를 결과 문자열의 맨 앞에 추가
            carry = sum / 2; // 다음 자릿수로의 carry 값을 계산합니다
        }
        return result.toString();

    }
}
