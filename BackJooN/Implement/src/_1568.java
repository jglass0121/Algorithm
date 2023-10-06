import java.util.LinkedList;
        import java.util.Scanner;

public class _1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int bird = 1;
        int result = 0;

        while (num >=1) {
            if (num < bird) {
                bird = 1;
            }
            num -= bird;
            bird++;
            result++;

        }
        System.out.println("result = " + result);


    }
}
