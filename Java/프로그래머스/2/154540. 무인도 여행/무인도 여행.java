import java.util.*;
class Solution {
    public int[] solution(String[] maps) {
               Character[][] arr = new Character[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                arr[i][j] = maps[i].charAt(j);
            }
        }

        return solve(arr);
    }
    
        private static int[] solve(Character[][] arr) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (Character.isDigit(arr[i][j])) {
                    int bfs = bfs(arr, i, j);
                    list.add(bfs);
                }

            }
        }

        Collections.sort(list);
        System.out.println("list = " + list);
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
    
        static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    private static int bfs(Character[][] arr, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int sum = arr[x][y]-'0';
        arr[x][y] = 'X';
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if(nx <0|| ny <0 || nx>=arr.length || ny >=arr[0].length) continue;
                if (arr[nx][ny] == 'X') {
                    continue;
                }

                if (Character.isDigit(arr[nx][ny])) {
                    sum += arr[nx][ny]-'0';
                    arr[nx][ny] = 'X';
                    queue.add(new int[]{nx, ny});
                }

            }
        }

        return sum;
    }
}