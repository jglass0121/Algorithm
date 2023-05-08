import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readLine = br.readLine();

        StringTokenizer st = new StringTokenizer(readLine);
        Integer numOne = Integer.parseInt(st.nextToken());
        Integer numTwo = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque();
        for (int i = 0; i < numOne; i++) {
            deque.add(i+1);
        }
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (!deque.isEmpty()) {
            i++;
            int temp = deque.poll();
            if (i % numTwo == 0) {
                list.add(temp);
            } else {
                deque.add(temp);
            }
        }

        System.out.println(list.toString().replace("[", "<").replace("]", ">"));

    }
}
