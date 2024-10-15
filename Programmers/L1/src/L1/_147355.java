package L1;

public class _147355 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "500220839878";

        int solution = solution(t, p);
        System.out.println("solution = " + solution);
    }

    private static int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long num = Long.parseLong(p);
        for (int i = 0; i < t.length()-len+1; i++) {
            long diff = Long.parseLong(t.substring(i, i + len));
            if(diff <= num) answer++;
        }
        return answer;


    }
}
