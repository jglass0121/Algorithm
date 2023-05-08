import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class _5086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str);
            int a  =  Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            String solution = solution(a, b);
            System.out.println( solution);


        }



    }

    private static String solution(int a, int b) {
        //약수
        if (a < b) {
            if (b % a == 0) {
                return "factor";
            }

        } else {

            if (a % b == 0) {
                return "multiple";
            }




        }
        return "neither";
    }
}
