import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 단어_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        while (num-- > 0) {
            char[] charArray = sc.nextLine().toCharArray();
            String str = "";
            for (int i = charArray.length-1; i >= 0; i--) {
                str += charArray[i];
            }
            System.out.println(str);
        }

    }
}
