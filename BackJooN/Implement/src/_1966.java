import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class _1966
{
    public static void main(String[] args) {
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
//                    // 내림차순으로 정렬하고 첫 번째 열을 출력
//                    Optional<int[]> first = queue.stream().sorted((a, b) -> b[0] - a[0]).findFirst();// 내림차순 정렬

                    for (int q[] :queue) {
                        if (q[1] > now[1]) {
                            flag = false;
                            break;
                        }
                    }
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
