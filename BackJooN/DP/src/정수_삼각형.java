import java.util.Scanner;

public class 정수_삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        int idx= 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= idx; j++) {
                arr[i][j] = sc.nextInt();
            }
            idx++;
        }

        System.out.println(solution(arr, num));


    }

    private static int solution(int[][] arr, int num) {
        int idx = 0;
        int[][] dp = new int[num][num];
        dp[0][0] =arr[0][0];
        for (int i = 0 ; i <num-1 ; i++) {
            for (int j = 0; j <= idx; j++) {
                int val  = dp[i][j];
                // 자신,  이후 값 찾기
                int nextOne = arr[i + 1][j];
                int nextTwo = arr[i + 1][j+1];

                //합 구하기 (자신 + 이후 ))
                 nextOne = val+nextOne;
                 nextTwo = val + nextTwo;

                // dp에 해당 값이 있다면 비교 ( 더 큰지 )
                if (dp[i + 1][j] != 0) {
                    dp[i + 1][j] =  Math.max(dp[i + 1][j], nextOne);


                }else{
                    dp[i + 1][j] = nextOne;
                }

                if (dp[i + 1][j + 1] != 0) {
                    dp[i + 1][j+1] =  Math.max(dp[i + 1][j+1], nextOne);

                }else{
                    dp[i + 1][j+1] = nextTwo;
                }



            }
            idx++;

        }


        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            max= Math.max(dp[num - 1][i],max);
        }

        return max;

    }
}
