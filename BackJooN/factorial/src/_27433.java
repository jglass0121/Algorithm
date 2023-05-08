import java.util.Scanner;

public class _27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fac(sc.nextLong()));

    }

    private static long fac(long i) {
        if (i <= 1) {
            return 1;

        }
        return i* fac(i-1);
    }
}
