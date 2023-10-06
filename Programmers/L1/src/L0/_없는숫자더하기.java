package L0;

import java.util.HashSet;
import java.util.Set;

public class _없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        solution(numbers);
    }

    private static int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <numbers.length; i++) {
            set.add(numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if (!set.remove(i)){
                sum += i;
            }
        }


        return sum;

    }
}
