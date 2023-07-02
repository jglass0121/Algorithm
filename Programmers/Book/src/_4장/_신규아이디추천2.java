package _4장;

public class _신규아이디추천2 {
    public static void main(String[] args) {
        String str = "z-+.^.";
        System.out.println(solution(str));
        ;
    }

    private static String solution(String new_id) {
        new_id = new_id.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(new_id.replaceAll("[^0-9a-z-._]","").
                replaceAll("[.]{2,}",".")
                .replaceAll("^[.]|[.]$",""));

        if (sb.length() ==0) {
            sb.append("a");
        }


        if (sb.length() >= 16) {
            sb.setLength(15);
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.replace(sb.length() - 1, sb.length(), "");
            }
        }
        if (sb.length() < 3) {
            while (sb.length() < 3) {

                char c = sb.charAt(sb.length() - 1);
                sb.append(c);
            }
        }

        String answer = sb.toString();
        return answer;

    }
}
