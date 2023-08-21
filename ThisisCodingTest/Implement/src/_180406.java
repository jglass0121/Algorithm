import java.util.Scanner;

public class _180406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int center = num.length()/2;
        int oneA = 0;
        for (int i = 0; i < center; i++) {
            int a = num.charAt(i) - '0';
            oneA += a;

        }
        int oneB = 0;
        for (int i = center; i <num.length(); i++) {
            int a = num.charAt(i) - '0';
            oneB += a;
        }

        if (oneA == oneB) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");

        }
    }
}
