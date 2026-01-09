package me;

import java.util.LinkedList;
import java.util.Queue;
//bfs
public class _1로_만들기 {
    public static void main(String[] args) {
        int val = 26;
        int solution = solution(val);
        System.out.println("solution = " + solution);
    }

    private static int solution(int num) {

        //bfs
        Queue<Integer> list = new LinkedList<>();
        list.add(num);

        int[] dx = {5, 3, 2, 1};
        int depth = 0;
        int[] ch = new int[300001];
        while (!list.isEmpty()) {
            int len = list.size();
            for (int i = 0; i < len; i++) {
                Integer poll = list.poll();
                int nx = -1;
                for (int j = 0; j < 4; j++) { // 4번
                    if (dx[j] == 1) {
                        nx = poll - dx[j];
                    }else if (poll % dx[j] == 0) {
                        nx = poll / dx[j];
                    }

                    if (nx == 1) return depth + 1;
                    if (nx >= 1 && nx <= 30000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        list.add(nx);
                    }
                }


            }

            depth++;
        }
        return depth;
    }
}
