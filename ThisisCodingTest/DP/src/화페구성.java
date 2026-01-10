import java.util.Arrays;
import java.util.Scanner;

public class 화페구성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        int[] arr = new int[one];
        for (int i = 0; i < one; i++) {
            arr[i] = sc.nextInt();
        }
// 금액 i를 만들 수있는최소한의 화폐개수
        int[] dp = new int[100];
        Arrays.fill(dp,10001);
        dp[0] = 0; // 금액 x를 만들기 위한 최소 화폐 개수
        for (int i = 0; i < one; i++) { // 화폐 단위
            for (int j = arr[i]; j <= two; j++) { //금액
                if (dp[j  - arr[i]] != 10001) {
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                }
                System.out.println("dp["+j+"] = " + dp[j]);
            }
        }
        if (dp[two] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(dp[two]);
        }

    }
}
