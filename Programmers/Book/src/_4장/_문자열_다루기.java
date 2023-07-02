package _4장;

public class _문자열_다루기 {
    public static void main(String[] args) {
        System.out.println(solution("5321"));

    }

    private static boolean solution(String s) {
        if ( ! (s.length() == 4 || s.length() == 6)) {
            return false;
        }

        try {

            int i = Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
