import java.util.Arrays;
import java.util.Scanner;

public class 뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();

        int prev = one.charAt(0)-'0';
        String a = ""+one.charAt(0);
        for (int i = 1; i < one.length(); i++) {
            int two = one.charAt(i) - '0';
            if (prev != two) {
                a += two;
                prev = two;
            }
        }
        
        int[] arr = new int[2];
        for (int i = 0; i < a.length(); i++) {
            int v = a.charAt(i) - '0';
            if (v == 0) {
                arr[0]++;
            } else {
                arr[1]++;
            }
        }
        System.out.println(Math.min(arr[0],arr[1]));



    }
}
