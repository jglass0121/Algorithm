package 구현;

public class 점찍기 {
    public static void main(String[] args) {
        int k = 2;
        int d = 4;
        solution(k, d);
    }

    private static void solution(int k, int d) {

        long cnt = 0;
        for (long x = 0; x <= d; x += k) {
            long maxY = (long) Math.sqrt((long) d * d - x * x);
            cnt += (maxY / k) + 1;
        }

        System.out.println("cnt = " + cnt);
    }
}
