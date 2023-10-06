import java.util.ArrayList;
import java.util.Scanner;

public class _18511 {
    static int N, K;
    static ArrayList<Integer> numbers;
    static int maxResult = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        numbers = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        findLargestNumber(0);
        System.out.println(maxResult);
    }

    static void findLargestNumber(int current) {
        if (current > N) {
            return;
        }

        for (int num : numbers) {
            int newNumber = current * 10 + num;

            if (newNumber <= N && newNumber > maxResult) {
                maxResult = newNumber;
            }

            findLargestNumber(newNumber);
        }
    }
}
