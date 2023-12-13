import java.util.Arrays;
import java.util.Scanner;

public class _볼링공고르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int res= 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if(arr[i]!= arr[j]){
                    res++;
                }

            }
        }
        System.out.println("res = " + res);


    }
}
