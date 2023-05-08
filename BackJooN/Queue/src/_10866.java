 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            solution(br.readLine(),deque,sb);

        }
        System.out.println(sb);
    }

    private static void solution(String br, Deque<Integer> deque, StringBuilder sb) {
        StringTokenizer st = new StringTokenizer(br);

        switch (st.nextToken()) {
            case "push_front":
                deque.addFirst(Integer.parseInt(st.nextToken()));
                break;
            case "push_back":
                 deque.addLast(Integer.parseInt(st.nextToken()));
                break;
            case "pop_front":
                if (!deque.isEmpty()) {
                    Integer integer = deque.removeFirst();
                    sb.append(integer).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
                break;
            case "pop_back":
                if (!deque.isEmpty()) {
                    Integer integer = deque.removeLast();
                    sb.append(integer).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }

                break;
            case "size":
                sb.append(deque.size()).append("\n");
                break;
            case "empty":
                if (!deque.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
                break;
            case "front":
                if (!deque.isEmpty()) {
                    sb.append(deque.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }

                break;
            case "back":
                if (!deque.isEmpty()) {
                    sb.append(deque.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
                break;
        }
    }
}
