public class _1이될때까지 {
    public static void main(String[] args) {
        int N = 25;
        int K =  3;

        int cnt = 0;
        while (N != 1) {
            if (N % K == 0) {
                N = N / K;
            } else {
                N -= 1;
            }
            cnt++;
        }

        System.out.println("cnt = " + cnt);


    }
}
