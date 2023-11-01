package L0;

public class _평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(solution(arr));
    }

    private static double solution(int[] arr) {
        double sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
        }

        sum = sum / arr.length;
        return sum;

    }
}
