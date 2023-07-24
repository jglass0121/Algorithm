import java.util.Arrays;
import java.util.Scanner;

public class 고정점찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i <num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println( binaryFind(arr,0,arr.length-1));


    }

    private static int binaryFind(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == mid) {
                return mid;
            } else if (arr[mid] > mid) {
                end = mid - 1;
            } else {
                start = mid +1;
            }

        }
        return -1;
    }
}
