package DFS_BFS;


public class 단어변환 {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        solution(begin, target, words);


    }

    static boolean[] visited;
    static int answer = 0;

    private static void solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

    }

    private static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt; // 몇번만에 변했는지 알기 위함
            return; // 최소
        }

        for (int i = 0; i < words.length; i++) {
            if(visited[i]) continue;

            int k = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) { // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false; //모든 경우의 수를 보기 위함
            }
        }



    }
}
