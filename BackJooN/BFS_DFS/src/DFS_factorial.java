import java.util.LinkedList;
import java.util.ListIterator;

public class DFS_factorial {
    private int V;
    private LinkedList<Integer> adj[];

    public DFS_factorial(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtils(v,visited);
    }

    void DFSUtils(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v + " ");
        ListIterator<Integer> iterator = adj[v].listIterator();
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            System.out.println("iterator.next() = " + n);
            if (!visited[n]) {
                DFSUtils(n, visited);
            }
        }

    }

    public static void main(String[] args) {


    }
}
