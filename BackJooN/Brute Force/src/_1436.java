import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int number = 666;
        int cnt = 1;
        while (cnt != i) {
            number++; // 667.. 668.. 669.. ~~ 1666
            if (String.valueOf(number).contains("666")) {
                cnt++;
            }
        }
        System.out.println(number);

    }
}
