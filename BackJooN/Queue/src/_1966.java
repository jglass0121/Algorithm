import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class _1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            Deque deque = new ArrayDeque();
            int one = Integer.parseInt( st.nextToken());
            int two = Integer.parseInt( st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            while (st2.hasMoreTokens()) {
                deque.add(st2.nextToken());
            }


            if (deque.size() == 1) {
                sb.append(1).append("\n");
            } else {
            }




        }

    }
}
