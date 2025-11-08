
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        solution(num, arr, k);


    }

    private static void solution(int num, int[] arr, int k) {
        int s = 0, e = arr.length - 1;
        Arrays.sort(arr);
        int cnt = 0;

        while (s < e) {
            int sum = arr[s] + arr[e];

            if (sum == k) {
                cnt++;
                s++;
                e--;
            } else if (sum < k) {
                s++;
            } else if (sum > k) {
                e--;
            }
        }
        System.out.println(cnt);

    }
}
