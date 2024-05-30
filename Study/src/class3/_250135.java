package class3;

public class _250135 {
    public static void main(String[] args) {
        int h1 = 0;
        int m1 = 5;
        int s1 = 30;
        int h2 = 0;
        int m2 = 7;
        int s2 = 0;

        solution(h1, m1, s1, h2, m2, s2);
    }

    private static void solution(int h1, int m1, int s1, int h2, int m2, int s2) {


        int cnt = 0;
        for (int i = h1; i <= 12; i++) {
            for (int j = m1; j <= 60; j++) {
                for (int k = s1; k <= 60; k++) {
                    if(k >s2) continue;
                    if(j >m2) continue;
                    if(i >h2) continue;
                    if(i == k && j ==k ) {
                        cnt++;
                        continue;
                    }


                    if(i == k ) cnt ++;
                    if(j == k ) cnt ++;

                }
            }
        }

    }
}
