import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _11478 {
    public static void main(String[] args) throws IOException {

        //중첩 for
        //String

        //중복되지 않는다면 map에넣는다

        Scanner sc= new Scanner(System.in);

        String s= sc.next();

        HashSet<String> set = new HashSet<>();

        System.out.println("s.length() = " + s.length());
        for(int i=0; i<s.length();i++) {
            System.out.println("i = " + i);
            for(int j=i+1;j<=s.length();j++) {
                System.out.println("j = " + j);
                if(!set.contains(s.substring(i, j))){
                    set.add(s.substring(i,j));
                }

            }
            System.out.println(" ============================= " );
        }

        System.out.println(set.size());

    }
}
