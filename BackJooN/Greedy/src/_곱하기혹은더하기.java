import java.util.Scanner;

public class _곱하기혹은더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int total = 1;
        for (int i = 0; i < s.length(); i++) {
            int a =  s.charAt(i) - '0';
            System.out.println("a = " + a);

            if (a == 0 || a == 1) {
                System.out.println(" 0 ");
                total = total + a;
                continue;
            }
                total = total * a;

        }




    }
}
