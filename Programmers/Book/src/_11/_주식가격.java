package _11;

import java.util.Arrays;
import java.util.Scanner;

public class _주식가격 {
    public static void main(String[] args) {
        int[] price = {1, 2, 3, 2, 3};
        solution(price);
    }

    private static void solution(int[] price) {
        int[] answer = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            int res = price[i];
            int cnt = 0;
            boolean isDown = false;
            for (int j = i+1; j < price.length; j++) {
                if(isDown)break;
                if(res <= price[j]){
                    cnt++;
                }else {
                    isDown=true;
                    cnt++;
                    continue;
                }
            }
            answer[i] =cnt;
        }
        System.out.println(Arrays.toString(answer));
    }
}
