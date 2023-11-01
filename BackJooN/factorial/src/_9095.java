import java.util.Scanner;

public class _9095 {
    static int[] arr = {1, 2, 3};
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            fac(n,0);
            System.out.println("cnt = " + cnt);

            cnt = 0;
        }
    }

    private static void fac(int n, int val) {
        if (val == n) {
            cnt++;
            return;
        }
        if (val > n) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            fac(n,val+arr[i]);
        }
    }
}
