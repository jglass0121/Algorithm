import java.util.LinkedList;
import java.util.Scanner;

public class 가장_짧은_문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String solution = solution(s, t);
        System.out.println(solution);

    }

    private static String solution(String s, String t) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (t.equals(""+s.charAt(i))) {
                list.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < list.size(); j++) {
                min = Math.min(min,Math.abs(i - list.get(j)));
            }

            sb.append(min).append(" ");
        }

        return sb.toString();
    }
}
