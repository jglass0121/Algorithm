
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        solution(N, K);
    }

    private static void solution(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (list.size() != 0) {
            int i = (idx + k - 1) % list.size();
            Integer remove = list.remove(i);
            sb.append(remove);
            if (list.size() != 0) {
                sb.append(", ");
            }
            idx = i;
        }

        sb.append(">");
        System.out.println(sb.toString());

    }
}
