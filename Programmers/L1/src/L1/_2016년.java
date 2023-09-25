package L1;

public class _2016년 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        System.out.println(solution(a, b));

    }

    private static String solution(int a, int b) {
        int sum = 0;
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        for (int i=0; i<a-1; i++) {
            sum+=date[i]; //총 몇칠
        }
        return day[(sum + b) % 7];
    }
}
