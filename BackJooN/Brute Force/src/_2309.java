import java.util.Arrays;
import java.util.Scanner;

public class _2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int num  = sc.nextInt();
            arr[i] = num;
            sum += num;
        }



        for (int i = 0; i < 8; i++) {
            System.out.println("i = " + i);
            for (int j = i+1; j < 9; j++) {
                System.out.println("j = " + j);
                if (arr[i] + arr[j] == sum - 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                            System.out.println(arr[k]);
                    }
                    return;
                }
            }
            System.out.println("-------------------");
        }





    }
}
