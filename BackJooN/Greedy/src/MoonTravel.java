import java.util.Scanner;

public class MoonTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 격자 행 수
        int m = sc.nextInt(); // 격자 열 수

        int[][] grid = new int[n][m]; // 격자 정보를 저장할 배열
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt(); // 각 격자 셀의 이동 비용 입력
            }
        }

        // dp 배열을 사용하여 최소 비용을 저장
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0]; // 출발 지점의 비용은 그대로

        // 첫 행을 채우기
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j]; // 왼쪽에서 오는 경우
        }

        // 첫 열을 채우기
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0]; // 위에서 아래로 오는 경우
        }

        // 나머지 격자를 채우기
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                // 왼쪽에서 오는 경우와 위에서 아래로 오는 경우 중 작은 비용 선택
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        int minCost = dp[n - 1][m - 1]; // 최종 목적지의 최소 비용
        System.out.println("최소 비용: " + minCost);
    }
}
