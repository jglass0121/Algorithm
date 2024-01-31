package String;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits = {9, 9, 9};
        solution(digits);

    }

    private static int[] solution(int[] digits) {

        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0; // 9일 경우 , 0 으로 설정 후 증가
            }

        }
        //모든 자리가 9였다면 배열 길이 증가시켜 첫자리에 1추가
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;


    }
}
