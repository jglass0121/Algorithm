public class 이어_붙인_수 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }

    private static int solution(int[] numList) {
        String odd = "";
        String even = "";
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % 2 == 0) { //짝수
                even += numList[i];

            } else {
                odd += numList[i];
            }
        }
        int answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;


    }
}
