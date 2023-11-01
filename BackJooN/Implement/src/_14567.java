import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _14567 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        int v = Integer.parseInt(s[1]);

        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new LinkedList());
        }

        int idegree[] = new int[n+1];
        for (int i = 0; i < v; i++) {
            String[] split = br.readLine().split(" ");
            int v1 = Integer.parseInt(split[0]);
            int v2 = Integer.parseInt(split[1]);
            list.get(v1).add(v2);
            idegree[v2]++;
        }


        totalsort(list, idegree);



    }

    private static void totalsort(LinkedList<LinkedList<Integer>> list, int[] idegree) {
        int[] res = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (idegree[i] == 0) {
                q.add(i);
                res[i] = 1;
            }
        }

        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < list.get(poll).size(); i++) {
                Integer val = list.get(poll).get(i);
                idegree[val]--;

                if (idegree[val] == 0) {
                    q.add(val);
                    res[val] = res[poll] + 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(res[i]+" ");

        }

    }
}
