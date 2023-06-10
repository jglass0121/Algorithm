package L1;

import java.util.*;

public class 과일_장수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = {1, 2, 3, 1, 2, 3, 1}; // 점수
        int k = sc.nextInt(); //상품 최상점
        int m = sc.nextInt(); //포잠

        solution(k, m, score);



    }

    private static int solution(int k, int m, int[] score) {
        int answer=0;
        Arrays.sort(score);
        for (int i = score.length-1; i>=0; i--) {
            if((score.length-i) % m == 0){
                answer += score[i] * m;
            }
        }
        return answer;
    }
}
