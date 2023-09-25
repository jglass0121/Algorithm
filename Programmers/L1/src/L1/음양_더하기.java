package L1;

public class 음양_더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        solution(absolutes, signs);

    }

    private static int solution(int[] absolutes, boolean[] signs) {

        int sum = 0;
        for (int i = 0; i < signs.length; i++) {
            boolean sign = signs[i];
            int absolute = absolutes[i];
            if (!sign) {
                sum+=  -absolute;
                continue;
            }
            sum += absolute;
        }

        return sum;
    }
}
