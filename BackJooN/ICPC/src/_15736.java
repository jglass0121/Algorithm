import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class _15736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //24
        sc.close();

        int[] arr = new int[num+1];
        //청 : 0
        //백 : 1
        arr[0] = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num ; j += i) { //1 ~ 24

            }
        }


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum++;
            }
        }
        System.out.println(sum);


    }
}
