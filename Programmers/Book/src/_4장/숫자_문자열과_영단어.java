package _4장;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "23four5six7";
        System.out.println(solution(s));

    }

    private static int solution(String s) {
        String str = "";
        String answer = "";
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) { //숫자라면
                answer += c;
                continue;
            }
            
            //문자라면
            str += ""+c;
            System.out.println("str = " + str);
            switch (str) {
                case "zero":
                    answer += 0;
                    str = "";
                    break;
                case "one":
                    answer += 1;
                    str = "";
                    break;
                case "two":
                    answer += 2;
                    str = "";

                    break;
                case "three":
                    answer += 3;

                    str = "";

                    break;
                case "four":
                    answer += 4;
                    str = "";
                    break;
                case "five":
                    answer += 5;
                    str = "";
                    break;
                case "six":
                    answer += 6;
                    str = "";
                    break;
                case "seven":
                    answer += 7;
                    str = "";
                    break;
                case "eight":
                    answer += 8;
                    str = "";
                    break;
                case "nine":
                    answer += 9;
                    str = "";
                    break;
                default:

                    break;


            }
        }
        return Integer.parseInt(answer);


    }
}
