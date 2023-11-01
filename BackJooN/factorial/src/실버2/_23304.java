package 실버2;

import java.util.Scanner;

public class _23304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0;
        String a = "";
        StringBuilder sb = new StringBuilder();
        int cen = s.length() / 2;
        String sub0 = s.substring(0, cen);
        String sub1 = s.substring(cen + 1);
        if (sub0.equals(sub1)) {
            System.out.println(sb.append("AKARAKA").toString());
        } else {
            System.out.println(sb.append("IPSELENTI").toString());

        }
    }

}
