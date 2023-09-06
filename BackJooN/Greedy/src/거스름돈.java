import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = 1000 - num;
        int[] arr = {500, 100, 50,10, 5, 1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += d / arr[i];
            d %= arr[i];
        }
        System.out.println(sum);
    }
}
