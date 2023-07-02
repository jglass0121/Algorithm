package _4장;

import java.util.Arrays;

public class _이진변환_반복하기  {
    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));
    }

    private static int[] solution(String s) {
        int[] arr = new int[2];
        while (s.length() > 1) {
            int lencount = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    arr[1]++;
                } else {
                    lencount++;
                }
            }

            //10진수 -> 2진수
            s= Integer.toBinaryString(lencount);
            arr[0]++;
        }

        return arr;

    }
}
