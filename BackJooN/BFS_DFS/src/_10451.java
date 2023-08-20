import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _10451 {
    static boolean visited ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int count = 0;
            int N = sc.nextInt();
            int[] arr = new int[N + 1];
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            for (int j = 1; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                System.out.println("arr[j] = " + arr[j]);

            }

            boolean visited[]  = new boolean[N + 1];

            for (int j = 1; j <= N; j++) {
                if (!visited[j]) {
                    visited[j] = true;
                    int next = arr[j];
                    while (true) {
                        if (visited[next]) {
                            count++;
                            break;
                        }
                        visited[next] = true;
                        next = arr[next];
                    }

                }
            }

            System.out.println(count);


        }
    }
}
