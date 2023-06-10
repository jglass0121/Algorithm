package L0;

import java.util.Scanner;

public class 접미사인지_확인 {
    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            String a = sc.next(); //my_String
            String b = sc.next(); //is_sub


            int result = 0;
            for (int i = 0; i < a.length(); i++) {
                String substring = a.substring(i);
                if (substring.equals(b)) {
                    result = 1;
                }
            }
            System.out.println("result = " + result);
        }

    }
}
