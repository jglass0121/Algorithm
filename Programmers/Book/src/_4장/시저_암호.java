package _4장;

public class 시저_암호 {
    public static void main(String[] args) {
        //반복 %
        //영어 총 26개

        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));


    }

    private static String solution(String s, int n) {
        String[] split = s.split("");
        String answer = "";
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(" ")) {
                split[i] = " ";

            } else {
                char c = split[i].charAt(0);

                if (Character.isLowerCase(c)) { //소문자
                    char c1 = (char) ((c - 'a' + n) % 26 + 'a');
                    split[i] =""+ c1;

                } else {
                    char c1 = (char) ((c - 'A' + n) % 26 + 'A');
                    split[i] =""+ c1;
                }

            }

            answer += split[i];
        }

        return answer;


    }
}
