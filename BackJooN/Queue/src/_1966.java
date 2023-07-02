import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 못품
 *  문서의 ‘중요도’
 */
public class _1966 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int cnt = 0;
            Queue<int[]> queue = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                queue.add(new int[] {j,sc.nextInt()});
            }

            for (int[] ints : queue) {
                System.out.println("ints[0] = " + ints[0]);
                System.out.println("ints[1] = " + ints[1]);
            }

            while (true) {
                int now[] = queue.remove();
                System.out.println("Arrays.toString(now) = " + Arrays.toString(now));
                boolean flag = true;
                for (int q[] :queue) {
                    if (q[1] > now[1]) {
                            flag = false;
                        break;
                    }
                }
                System.out.println("flag = " + flag);

                
                if (flag) {
                    cnt++;
                    if (now[0] == M) {
                        break;
                    }
                } else {
                    queue.add(now);
                }
            }
            System.out.println(cnt);

        }
    }
}
