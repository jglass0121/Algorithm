package 완전탐색;

public class 모음사전 {

    public static void main(String[] args) {
        String word = "AAAE";
        System.out.println(solution(word));
    }

    static char[] alpha = {'A', 'E', 'I', 'O', 'U'};
    private static int solution(String word) {

          fac(word, "", 0);
        return cnt;


    }

    static int cnt = 0;
    static int result = 0;
    static boolean isStop = false;
    private static void fac(String word, String res, int depth) {
        if(depth == 6) return;

        if (word.equals(res)) {
            isStop = true;
            return;
        }

        for (int i = 0; i < alpha.length; i++) {
            if(isStop) return;
            if(depth+1 < 6) cnt++;
            fac(word,res+alpha[i] , depth+1);

        }

    }

}
