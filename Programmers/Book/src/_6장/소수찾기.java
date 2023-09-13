package _6장;

public class 소수찾기 {
    static String[] split;
    public static void main(String[] args) {
        String number = "17";
        solution(number);
    }

    private static void solution(String number) {
        split = number.split("");
        boolean[] visited = new boolean[split.length+1];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        dfs("", 0,visited);
    }

    //방문여부
    //소수인지
    private static void dfs(String now, int idx, boolean[] visited) {

        if (split.length == idx) {
            return;
        }

        for (int i = 0; i <split.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(now + split[i], idx + 1, visited);
                visited[i] = false;
            }

        }


    }

}
