import java.util.Scanner;

/**
 * 브루트- 포스법
 */
public class _8_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = "ABC이지스DEF";
        System.out.print("패턴 : ");
        String s2 = "이지스";

        int idx = bMatch(s1, s2);
        if (idx == -1) {
            System.out.println("텍스트 패턴이 없습니다.");
        } else {
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += s1.substring(i,i+1).getBytes().length;
                System.out.println("s1.substring(i,i+1).getBytes().length = " + s1.substring(i, i + 1).getBytes().length);
                System.out.println("len 초기= " + len);

            }
            len += s2.length();

            System.out.println("s2.length() = " + s2.length());



            System.out.println("len = " + len);
            System.out.println((idx+1)+"번재 문자부터 일치");
            System.out.println("텍스트:"+s1);
            System.out.printf(String.format("패턴 :%%%ds\n",len),s2);

        }




    }

    private static int bMatch(String txt, String pat) {
        int pt = 0; // txt커서
        int pp = 0; // pat커서

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pat.length()) {
            return pt - pp;
        } else {
            return -1;
        }

    }
}
