import java.util.Scanner;

public class _14568 {
    public static void main(String[] args) {
        //남규 +2 = 영훈
        //택희 짝수

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // i : 짝수  j 영 k 남+2
        int result = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= num; k++) {
                    if (i + j + k == num) {
                        if (k >=j+2 && i % 2 == 0) {
                            result++;
                        }
                    }
                }
            }
        }

        System.out.println( result);
    }
}
