import java.util.Arrays;
import java.util.Scanner;

public class 떡볶이_떡_만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int m = sc.nextInt();
       int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색을 위한 정렬
        Arrays.sort(arr);

        System.out.println(findHeight(arr, m, 0, arr[n - 1]));
    }

    private static int findHeight(int[] arr, int target, int start, int end) {
        int max = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum= Arrays.stream(arr).filter(x -> x > mid)
                    .map(x -> x - mid).sum();

            if (sum < target) {
                end = mid - 1;
            } else {
                max = mid;
                start = mid + 1;
            }

        }
        System.out.println("end = " + end);
        System.out.println("start = " + start);
        System.out.println("max = " + max);



        return max;
    }
}
