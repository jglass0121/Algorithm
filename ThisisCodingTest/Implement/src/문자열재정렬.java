import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 문자열재정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        LinkedList<String> arr = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            try {
                sum += Integer.parseInt(String.valueOf(c));
            } catch (Exception e) {
                arr.add( ""+c);
            }
        }


        Collections.sort(arr);
        String res = String.join("", arr);
        if (sum != 0) {
            res += sum;
        }
        System.out.println(res.trim());



    }
}
