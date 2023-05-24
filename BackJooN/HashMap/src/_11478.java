import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();

        //Set으로 중복 없액
        //count 5+4+3+2+1
        Set<String> set = new HashSet<>();
        for (int i = 0; i <one.length(); i++) {
            for (int j = i; j < one.length()+1; j++) {
                String substring = one.substring(i, j);
                if (!substring.equals("")) {
                    set.add(substring);

                }

            }

        }
        System.out.println(set.size());

    }
}
