public class _4673_2 {
    public static void main(String[] args) {
        boolean[] a = new boolean[10001];

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