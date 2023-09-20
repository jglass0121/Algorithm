import java.util.Scanner;

public class _1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();

        int cnt = 0;
        int idx = 0;
        while (idx < one.length() - two.length()) {
            if (one.substring(idx, idx + two.length()).equals(two)) {
                cnt++;
                idx += two.length();
            } else {
                idx++;
            }
        }

        System.out.println( cnt);


    }
}
