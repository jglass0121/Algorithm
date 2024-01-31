package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        solution(strs);
    }

    private static String solution(String[] strs) {

        String first = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            while (strs[i].indexOf(first) != 0) {
                first= first.substring(0, first.length() - 1);
                if (first.isEmpty()) {
                    return "";
                }
            }
        }

        return first;
    }
}
