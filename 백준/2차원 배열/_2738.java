import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2738 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("a = " + a);
        int b = sc.nextInt();
        System.out.println("b = " + b);

        try {

            int[][] array2 = new int[a][b];
            int[][] array = new int[a][b];
            for (int i = 0; i < a; i++) {
                System.out.println("i = " + i);
                for (int j = 0; i < b; j++) {
                    array[a][b] = sc.nextInt();
                    System.out.println("array["+i+"]["+j+"] = " + array[a][b]);
                }
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; i < b; j++) {
                    array2[a][b] = sc.nextInt();
                }
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; i < b; j++) {
                    System.out.println(array[a][b] + array2[a][b]);
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {

        }





    }
}
