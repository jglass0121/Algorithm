package _12장;

public class k진수에서소수개수구하기 {
    public static void main(String[] args) {
        int n = 56011;
        int k = 6;
        int solution = solution(n, k);
        System.out.println(solution);
    }

    private static int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        //System.out.println(Integer.toString(n, k));
        while (n >= 1) {
            int div = n % k;
            sb.append(div);
            n = n / k;
        }

        String res = sb.reverse().toString();
        //이진 탐색 - s, e

        int s = 0, e = 0;
        int cnt = 0;
        while (e != res.length()) {
            char eChar = res.charAt(e);
            //s부터 0까지의 수를 구하
            if (eChar == '0') {
                if (e > s) {

                    long value = Long.parseLong(res.substring(s, e));
                    if (isPrime(value)) {
                        cnt++;
                    }
                }

                s = e+1;
            }
            e++;
        }


        if (s != res.length()) {
            String substring = res.substring(s, e);
            int value = Integer.parseInt(substring);
            if (isPrime(value)) {
                cnt++;
            }
        }


        return cnt;


    }

    private static boolean isPrime(long value) {
        if (value <= 1) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
}
