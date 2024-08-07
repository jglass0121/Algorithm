public class _1이_될때까지 {
    public static void main(String[] args) {
        int N = 25;
        int K = 5;
        int cnt = 0;
        while (N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            cnt += 1;
        }
        System.out.println("cnt = " + cnt);
    }
}
