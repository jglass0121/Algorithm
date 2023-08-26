import java.util.Scanner;

public class _1로_만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));
    }

    static int[]  dp = new int[100]; //수

    //1의 경우 자기자신이 1이기에 연산 수행x ->  0으로 초기화
    private static int fibo(int num) {
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }

            if (i % 5 == 0) {
                dp[i] = Math.min(dp[i],dp[i/5]+1);
            }

            System.out.println(dp[i]);
        }

        return dp[num];
    }
}
