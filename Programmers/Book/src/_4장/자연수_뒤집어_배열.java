package _4장;

import java.util.Arrays;

public class 자연수_뒤집어_배열 {
    public static void main(String[] args) {
        int n = 12345;
        자연수_뒤집어_배열 solution = new 자연수_뒤집어_배열();
        int[] solution1 = solution.solution(n);
        System.out.println(Arrays.toString(solution1));

    }

    public int[] solution(long n) {
        //        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();

        String  a = "" + n;
        String[] split = a.split("");
        int[] answer = new int[split.length];


        int j = 0;
        for (int i = split.length - 1; i >= 0; i--) {
            answer[j] = Integer.parseInt(split[i]);
            j++;
        }
        return answer;
    }
}
