package String;

public class TwoSum11 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        solution(numbers,target);
    }

    private static int[] solution(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int firstIndex = numbers[i];
                int twoIndex = numbers[j];
                if (firstIndex + twoIndex == target) {
                    return new int[]{i+1,j+1};
                }

            }
        }
        return numbers;
    }
}
