import java.util.LinkedList;

public class _4673 {
    public static void main(String[] args) {
        boolean[] a = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int result = d(i);
            if (result <= 10000) {
                a[result] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!a[i]) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}