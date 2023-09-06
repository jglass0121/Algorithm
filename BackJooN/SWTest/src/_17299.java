import java.util.Scanner;

public class _17299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
           String s = sc.nextLine();
            int min = Integer.MAX_VALUE;
            for (int j = 1; j < s.length(); j++) {
                String one = s.substring(0, j);
                String two = s.substring(j, s.length());
                int sum = Integer.parseInt(one) + Integer.parseInt(two);
                min = Math.min(sum, min);

            }
            System.out.printf("#%d %d",i+1,min);
            System.out.println();

        }
        }
}

