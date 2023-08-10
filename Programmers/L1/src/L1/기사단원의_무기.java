package L1;


public class 기사단원의_무기 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power= 2;

        System.out.println(solution(number,limit,power));

    }

    private static int solution(int number, int limit, int power) {
        int[] arr = new int[number+1];
        int result = 0;

        for (int i = 1; i <= number; i++) {
            arr[i] = i;
            int n = 0;
            for (int j = 1; j * j <= arr[i]; j++) {
                if (j * j == arr[i]) {
                    n++;
                } else if (arr[i] % j == 0) {
                    n += 2;
                }
                if (n > limit) {
                    n = power;
                    break;
                }

            }
        }

        return result;


    }
}
