package DP;

public class 땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {
                {1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

        solution(land);

    }

    private static int solution(int[][] land) {

        int[][] dp = new int[land.length][land[0].length];

        for (int i = 0; i < land[0].length; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < land.length; i++) { // 열
            for (int j = 0; j < land[0].length; j++) { // 행
                int max= -1;
                for (int k = 0; k < land[0].length; k++) {  //행
                    if(j == k) continue;
                    if (max < dp[i - 1][k] + land[i][j]) {
                        dp[i][j] = dp[i - 1][k] + land[i][j];
                        max = dp[i - 1][k] + land[i][j];
                    }
                }


            }
        }


        int max = -1;
        for (int i = 0; i < land[0].length; i++) {
            if (max < dp[land.length - 1][i]) {
                max = dp[land.length - 1][i];
            }
        }

        return max;
    }
}
