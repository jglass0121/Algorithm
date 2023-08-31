import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int total = sc.nextInt();

        Integer[] arr = new Integer[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= total) {
                sum += total / arr[i];
                total = total % arr[i];
            }
        }

        System.out.println(sum);



}
}
