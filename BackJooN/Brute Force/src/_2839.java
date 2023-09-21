import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1; // 결과 초기값을 -1로 설정

        // 5킬로그램 봉지의 개수를 0부터 N까지 반복하면서 확인
        for (int num5 = 0; num5 <= N / 5; num5++) {
            // 남은 설탕 중에서 5킬로그램 봉지로 나눠지지 않는 부분을 3킬로그램 봉지로 채울 수 있는지 확인
            int remaining = N - (num5 * 5);
            if (remaining % 3 == 0) {
                // 5킬로그램 봉지와 3킬로그램 봉지의 개수 계산
                int num3 = remaining / 3;
                // 결과값 업데이트
                result = num5 + num3;
                break; // 가능한 최소 개수를 찾았으므로 루프 종료
            }
        }

        System.out.println(result);
    }
}
