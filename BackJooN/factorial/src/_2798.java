import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        System.out.println("num = " + num);

        int M = sc.nextInt();
        System.out.println("M = " + M);
        int[] ar = new int[num];
        for (int i = 0; i < num; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ar));


        int max = 0;
        outer:
        for (int i = 0; i < ar.length - 2; i++) {
            for (int j = i + 1; j < ar.length - 1; j++) {
                for (int k = j + 1; k < ar.length; k++) {
                    sum = ar[i] + ar[j] + ar[k];
                    if (sum <= M) {
                        max = Math.max(max, sum);
                    }
                    if (max == M) {
                        break outer;
                    }
                }

            }


        }
        System.out.println(max);

    }
}
