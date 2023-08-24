package L1;

public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";

        System.out.println(solution(t, p));
    }

    private static int solution(String t, String p) {
        int pl = p.length();


        int reslut = 0;
        for (int i = 0; i < t.length()-pl+1; i++) {
            int num = Integer.parseInt(t.substring(i, i + pl));
            if (num <= Integer.parseInt(p)) {
                reslut++;
            }
        }

        return reslut;
    }
}
