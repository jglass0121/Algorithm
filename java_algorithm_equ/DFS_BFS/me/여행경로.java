package me;

import java.util.*;

public class 여행경로 {

    static List<String> answer = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) {
        String[][] tickets = {
                {"ICN", "SFO"},
                {"ICN", "ATL"},
                {"SFO", "ATL"},
                {"ATL", "ICN"},
                {"ATL", "SFO"}
        };

        solution(tickets);
    }

    private static void solution(String[][] tickets) {

        visited = new boolean[tickets.length];

        List<String> route = new ArrayList<>();
        route.add("ICN");

        dfs("ICN", tickets, route);

        System.out.println(answer);
    }

    private static void dfs(String current, String[][] tickets, List<String> route) {

        if (route.size() == tickets.length + 1) {
            answer = new ArrayList<>(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {

                visited[i] = true;
                route.add(tickets[i][1]);

                dfs(tickets[i][1], tickets, route);

                route.remove(route.size() - 1);
                visited[i] = false;
            }
        }
    }
}