package DFS_BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 여행경로_1 {

    static ArrayList<String> allRoutes = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        String[][] tickets = {
                {"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}
        };

        String[] answer = solution(tickets);
        System.out.println(Arrays.toString(answer));
    }

    public static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];

        // 1. "ICN"에서 DFS 탐색 시작
        // 매개변수: (현재 공항, 지금까지의 경로, 티켓 배열, 사용한 티켓 수)
        dfs("ICN", "ICN", tickets, 0);

        // 2. 완성된 모든 가능한 경로들을 알파벳 순으로 정렬
        Collections.sort(allRoutes);

        System.out.println("allRoutes = " + allRoutes);
        // 3. 가장 앞에 있는(알파벳 순으로 빠른) 경로를 배열로 변환하여 반환
        return allRoutes.get(0).split(" ");
    }

    private static void dfs(String current, String route, String[][] tickets, int count) {
        // 종료 조건: 모든 티켓을 다 사용한 경우
        if (count == tickets.length) {
            allRoutes.add(route);
            return;
        }

        // 모든 티켓을 순회하며 다음 목적지 탐색
        for (int i = 0; i < tickets.length; i++) {
            // 아직 사용하지 않은 티켓 중, 출발지가 현재 공항과 일치하는 경우
            if (!visited[i] && tickets[i][0].equals(current)) {

                visited[i] = true; // 티켓 사용 처리 (방문)

                // 다음 목적지로 이동 (경로에 목적지 추가, 티켓 사용 수 1 증가)
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, count + 1);

                visited[i] = false; // 백트래킹: 다른 경로도 탐색할 수 있도록 티켓 사용 취소
            }
        }
    }
}