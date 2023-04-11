import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            deque.add(i + 1);
        }
        int result = 0;
        //while로 계산
            //짝수면 버리기
        int i = 0;
        while (true) {
            if (deque.size() == 1) {
                break;
            }
            if (i % 2 == 0) {
                deque.pollFirst();
            } else {
                Integer pollFirst = deque.pollFirst();
                deque.addLast(pollFirst);
            }

            //홀수면 뒤로 삽입
        i++;
        }

        System.out.println(deque.peek());


    }
}
