package L1;

public class _핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        solution(phone_number);
    }

    private static void solution(String phoneNumber) {
        int phone_len = phoneNumber.length();
        String phone_sub = phoneNumber.substring(phone_len - 4, phone_len);
        int starLen = phone_len - 4;
        String answer = "";
        answer+= "*".repeat(starLen);
        answer += phone_sub;

        System.out.println(answer);


    }
}
