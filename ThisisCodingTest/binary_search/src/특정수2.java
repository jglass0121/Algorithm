import java.util.Arrays;
import java.util.Scanner;

public class 특정수2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 데이터의 개수 N, 찾고자 하는 값 x 입력받기
        int n = sc.nextInt();
        int x = sc.nextInt();

        // 전체 데이터 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = Arrays.binarySearch(arr, x); //첫수

    }
}
