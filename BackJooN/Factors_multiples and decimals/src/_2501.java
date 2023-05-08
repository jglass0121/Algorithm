import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

public class _2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a =  Integer.parseInt( st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num = 0;
        int result = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                num++;
                if (num == b) {
                    result = i;
                }
            }
        }

        System.out.println(result);

    }
}
