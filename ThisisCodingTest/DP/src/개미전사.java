import java.util.Scanner;

public class 개미전사 {
    public static void main(String[] args) {
        int[] d = new int[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]); //d[1]은 0번째와 1번째 비교하여 더 큰 값 1개이기에

        for (int i = 2; i < n; i++) {
            //현재값의 전에 있는 값과 2번째 전에 있는값+현재값
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        System.out.println(d[n-1]);


    }
}
 