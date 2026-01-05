import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * bfs
 */
public class 송아지찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s, e));
    }

    static  int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> queue =  new LinkedList<Integer>();
    static  int answer = 0;

    private static int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.add(s);
        int depth = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Integer x = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x+dis[j];
                    if(nx == e) return depth+1;
                    if(nx >=1 && nx <= 10000 && ch[nx] ==0) { // 방문 안하고 범위안인 경우
                        ch[nx] =1;
                        queue.add(nx);
                    }
                }
            }
            depth++;
        }


        return depth;
    }
}
