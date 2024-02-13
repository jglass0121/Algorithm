package L1;

public class 문자열_나누기{
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution(s));
    }

    private static int solution(String s) {

        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return result;
    }
}

