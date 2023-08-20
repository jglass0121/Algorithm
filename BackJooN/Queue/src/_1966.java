import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
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



            while (true) {
                int now[] = queue.remove();
                boolean flag = true;
                for (int q[] :queue) {
                    if (q[1] > now[1]) { //중요도가 큰 것이 있으면 false
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
