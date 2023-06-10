package L1;

import java.sql.PreparedStatement;

public class 둘만의_암호 {
    public static void main(String[] args) {
        //아스키코드를 사용하여 현재 단어 +index를 한후 해당 단어에 skip이 있는 경우 추가해서 +
        //z일 경우 다시 a로 이동

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(solution(s, skip, index));
    }

    private static String solution(String s, String skip, int index) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("c = " + c);

            int count = 1;
            while (count <= index) {
                ++c;
                System.out.println("c = " + c);
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(c + "")) {
                    continue;
                } else {
                    count++;
                }
            }
            answer += c;

        }
        return answer;
    }

}