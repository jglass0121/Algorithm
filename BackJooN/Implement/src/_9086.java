import java.util.Scanner;

public class _9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < i; j++) {
            String s = sc.nextLine();
            if (s.length() == 1) {
                char c = s.charAt(0);
                System.out.print(c);
                System.out.print(c);
            } else {
                int length = s.length();
                char start = s.charAt(0);
                char end = s.charAt(length - 1);
                System.out.print(start);
                System.out.print(end);
            }
            System.out.println();
        }
    }
}
