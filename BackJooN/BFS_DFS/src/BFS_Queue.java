import java.util.LinkedList;
import java.util.ListIterator;

public class BFS_Queue {
    private int V;
     LinkedList<Integer> adj[];

    public BFS_Queue(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V]; //기억장소
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s); //

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s + " ");
            ListIterator<Integer> iter = adj[s].listIterator();
            while (iter.hasNext()) {
                Integer n = iter.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }

            }
        }
    }

    public static void main(String[] args) {
        BFS_Queue bfsQueue = new BFS_Queue(7);
        bfsQueue.addEdge(1, 2);
        bfsQueue.addEdge(1, 3);
        bfsQueue.addEdge(1, 4);
        bfsQueue.addEdge(2, 3);
        bfsQueue.addEdge(2, 1);
        bfsQueue.addEdge(2, 4);
        bfsQueue.addEdge(2, 5);
        bfsQueue.BFS(1);




    }


}
