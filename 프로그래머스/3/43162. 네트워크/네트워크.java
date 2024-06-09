import java.util.LinkedList;

class Solution {
    
        static LinkedList<LinkedList<Integer>> list = new LinkedList<>();
    static boolean[] visited ;
    
    public int solution(int n, int[][] computers) {
          visited = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            list.add(new LinkedList<Integer>());
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if(i==j) continue;
                if(computers[i][j] == 1){
                    list.get(i).add(j);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i <n; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt += 1;
            }
        }

        return cnt;

    }
    
    private static void dfs(int start) {

        visited[start] = true;
        for (int i = 0; i < list.get(start).size(); i++) {
            Integer next = list.get(start).get(i);
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}