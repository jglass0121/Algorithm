package sample;

public class one {
    public static void main(String[] args) {
        long n = 6;
        solution(n);

    }

    private static long[] solution(long n) {

        long fullWeeks = n / 7;
        long remainDay = n % 7;
        long min = fullWeeks * 2;
        long max = fullWeeks * 2;

        if (remainDay == 1) {
            max += 1;
        } else if (remainDay >1) {
            max += 2;
        }

        if (remainDay == 6) {
            min += 1;
        }

        return new long[]{min, max};


    }
}
