import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        solution(N, K);
    }

    private static void solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        int idx= 0;
        sb.append("<");
        while (!queue.isEmpty()) {
            idx++;

            if (idx == k) {
                idx = 0;
                if (queue.size() == 1) {
                    sb.append(queue.poll()).append(">");
                }else{
                    sb.append(queue.poll()).append(", ");
                }
            }else{
                Integer poll = queue.poll();
                queue.add(poll);
            }
        }
        System.out.println(sb);


    }
}
