package _6장;

import java.util.Arrays;

/**
 * 대각선 4
 * 노랑색 2*1 이면 (2+1)*2
 *
 * 가로 : 노랑색+2
 * 세로 : 노랑색 +2
 *
 * 곱하기
 *
 * 여러개일 수 도 있으니
 * 1. 가로 > 세로
 * 
 * 6>,4
 4
 * 4 1 = 갈색 - (4+2)*2+1*2  
 * 2 2 = 갈색 - (2+2)*2+양옆(2*2)
 * 
 * 24
 * 6,4
 * 8,3x
 */

public class 카펫 {
    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;
        System.out.println(Arrays.toString(solution(brown, yellow)));
    }

    private static int[] solution(int brown, int yellow) {
      //2 -> 2*1 / 1*2  x>y  x*y =2
        int[] answer = new int[2];
        for (int i = 1; i <= yellow; i++) {
            if (yellow%i==0) {
                 int y = yellow / i; //세로
                 int x = i; //가로

                if (x >= y) {
                    if ((x + 2) * 2 + (y * 2) == brown) {
                        answer[0] = x+2;
                        answer[1]= y+2;
                    }
                }
            }
        }

        return answer;



    }
}

