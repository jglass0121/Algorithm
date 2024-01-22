package Arrays101;

public class 짝수자리의숫자찾기 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        solution(nums);
    }

    private static int solution(int[] nums) {
        int even = 0;
        for (int n : nums) {
            String s = "" + n;
            if (s.length() % 2 == 0) {
                even++;
            }
        }

        return even;
    }

}
