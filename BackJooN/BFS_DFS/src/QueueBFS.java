import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 너비 우선 탐색
 */
public class QueueBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //정점의 개수
        int m = sc.nextInt(); //간선의 개수
        int v = sc.nextInt(); //탐색을 시작할 정점의 번호

        boolean visited[] = new boolean[n+1]; //방문 여부를 검사할 배열

        LinkedList<Integer>[] adList = new LinkedList[n + 1];

        for (int i = 0; i < n; i++) {
            adList[i] = new LinkedList<>();
        }

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adList[v1].add(v2);
            adList[v2].add(v1);
        }


    }



}
