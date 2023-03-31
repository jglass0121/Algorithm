import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr;

        for (int i = 0; i <5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println("st count = " + st.countTokens());
            arr = new String[i][st.countTokens()];
            for (int j = 0; j <st.countTokens() ; j++) {

            }
        }

    }
}
