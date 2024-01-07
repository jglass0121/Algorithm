package binary;

public class 제곱 {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(solution(x));
    }

    private static int solution(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            long pow = (long) mid * mid; // 오버플로우 방지를 위해 mid를 long으로 변환
            if (pow == x) {
                return mid;
            } else if (pow > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left - 1; // 정수 부분 반환
    }
}
