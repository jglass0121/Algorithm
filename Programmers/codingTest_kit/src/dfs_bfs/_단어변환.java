package dfs_bfs;

public class _단어변환 {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));
    }

    private static int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
         dfs(begin, target, words, visited, 0);
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }
    private static int minCount = Integer.MAX_VALUE;

    private static void dfs(String current, String target, String[] words, boolean[] visited, int cnt) {

        if (current.equals(target)) {
            minCount = Math.min(minCount, cnt);
            return ;
        }
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isConvert(current, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, visited, cnt + 1);
                visited[i] = false;

            }
        }

    }

    private static boolean isConvert(String current, String word) {
        int diff = 0;
        for (int i = 0; i < current.length(); i++) {
            if (current.charAt(i) != word.charAt(i)) {
                diff++;
                if (diff > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
