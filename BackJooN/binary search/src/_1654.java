import java.util.Arrays;
import java.util.Scanner;

public class _1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(binary_search(b, arr));

    }
    private static int binary_search(int b, int[] arr) {
        long start = 1;
        long end = arr[arr.length-1]; //가능한 최대 길이
        while (start <= end) {
            long center = (start + end) / 2;
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i] / center;
            }

                if (cnt >= b) {
                    start = center + 1;
                } else {
                    end = center - 1;
                }


            }
        return (int)end;
    }
}
