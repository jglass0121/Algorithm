import java.util.LinkedList;
import java.util.Scanner;

public class _2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            list.add(new int[]{ i + 1,s});
        }

        System.out.println(list.size());

        int[] poll = list.poll();
        int move = poll[0];
        int nowNum = poll[1];

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        while (list.size() == 0) {
            System.out.println("0이아닌");
            if (move < 0) { // 음수  - 왼쪽
                for (int i = 1; i < move; i++) {
                    list.add(list.poll());
                }
                int[] next = list.poll();
                move = next[1];
                sb.append(next[0] + " ");

            } else { //정수
                for (int i = 1; i < move; i++) {
                    list.add(list.poll());
                }
                int[] next = list.poll();
                move = next[1];
                sb.append(next[0] + " ");


            }
        }
        System.out.println(sb.toString());

    }
}
