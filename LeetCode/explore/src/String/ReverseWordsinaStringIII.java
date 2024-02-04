package String;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        solution(s);
    }

    private static String solution(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String stringOne = split[i];
            String reverse = reverse(stringOne);
            sb.append(reverse + " ");
        }
        return sb.toString().trim();
    }

    private static String reverse(String stringOne) {
        int start = 0;
        int end = stringOne.length()-1;
        String[] stringSplit = stringOne.split("");
        while (start < end) {
            String temp = stringSplit[start];
            stringSplit[start]  = stringSplit[end];
            stringSplit[end] = temp;
            start++;
            end--;
        }

        String result = "";
        for (int i = 0; i < stringSplit.length; i++) {
            result += stringSplit[i];

        }


        return result;

    }
}
