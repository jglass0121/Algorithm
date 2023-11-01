package 실버1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class _2267 {
    static int[][] arr;
    static int i;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        arr = new int[i][i];
        sc.nextLine();
        for (int j = 0; j < i; j++) {
            String[] split = sc.nextLine().split("");

            for (int k = 0; k < i; k++) {
                arr[j][k] = Integer.parseInt(split[k]);
            }


        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                cnt = 0;
                if (dfs(j, k)) {
                    list.add(cnt);
                }
            }
        }

        Collections.sort(list);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

    }

    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >=i || y <= -1 || y >= i) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (arr[x][y] == 1) {
            // 해당 노드 방문 처리
            cnt++;
            arr[x][y] = 0;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}
