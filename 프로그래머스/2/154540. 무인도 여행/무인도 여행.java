import java.util.*;
class Solution {
        static boolean[][] visited;

    public int[] solution(String[] maps) {
 String[][] arr = new String[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            String[] split = maps[i].split("");
            for (int j = 0; j < split.length; j++) {
                arr[i][j] = split[j];
            }
        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (!arr[i][j].equals("X") && !visited[i][j]) {
                    dfs(i, j, arr);
                    list.add(sum);
                    sum = 0;
                }
            }
        }
        int[] res = list.stream().mapToInt(i -> i.intValue()).toArray();
        Arrays.sort(res);
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        return res;
    }
        static int sum = 0;
    private static void dfs(int x, int y, String[][] arr) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length) {
            return;
        }
        if (arr[x][y].equals("X")) {
            return;
        }

        if (!visited[x][y]) {
            visited[x][y] = true;
            sum += Integer.parseInt(arr[x][y]);
            dfs(x - 1, y, arr);
            dfs(x , y-1, arr);
            dfs(x + 1, y, arr);
            dfs(x , y+1, arr);
        }


    }
}