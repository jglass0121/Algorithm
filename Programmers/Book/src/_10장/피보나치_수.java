package _10장;

public class 피보나치_수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));

    }

    private static int solution(int n) {

        int[] d = new int[n+1];
        d[0] = 0;
        d[1] = 1;


        for (int i = 2; i <=n ; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }

        return d[n];
    }
}
