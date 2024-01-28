package DFS_BFS;

import java.util.*;

class Solution {
    // 들어온 문자열을 오름차순으로 정렬해주기 위해 PriorityQueue를 만들었다.
    public Queue<String> pq = new PriorityQueue<>();
    // 요건 dfs에서 지나간 배열을 다시 들르게 하지 않기 위한 플래그이다.
    public boolean[] visited;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        // 처음 출발은 무조건 "ICN"공항에서 출발한다기에 그냥 값으로 못박아버렸다.
        dfs(tickets, "ICN", 0, "ICN");
        // PriorityQueue에 들어온 값들 중 처음 값이 최적 경로이므로 첫 값을 배열로 넣었다.
        String[] answer = pq.peek().split(",");
        return answer;
    }

    public void dfs(String[][] tickets, String currentCity, int cnt, String path){
        // 5. count가 tickets.length와 같으면 모든 배열을 순회한 것이므로
        if(cnt == tickets.length){
            // 6. pq에 전체 여행 경로를 추가
            pq.add(path);
            return;
        }
        for(int i=0;i<tickets.length;i++){
            // 1. 간 적이 없고 && 현재 도시가 다음 여행 경로의 도착지라면
            if(!visited[i] && currentCity.equals(tickets[i][0])){
                // 2. 갔다고 체크
                visited[i] = true;
                // 3. 그 다음 경로 탐색
                dfs(tickets, tickets[i][1], cnt+1, path +","+ tickets[i][1]);
                // 4. 모든 배열을 순회했으면, 플래그를 초기화
                visited[i] = false;
            }
        }
    }
}
