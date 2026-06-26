package DFS_BFS;

import javax.management.MBeanRegistrationException;

public class 단어변환2 {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int solution = solution(begin, target, words);
        System.out.println(solution);
    }

    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;


    private static int solution(String begin, String target, String[] words) {
        //dfs
        visited = new boolean[words.length];

         dfs(begin, target, words, 0);

        return answer == Integer.MAX_VALUE ? 0 : answer;

    }


    private static void dfs(String begin, String target, String[] words, int depth) {
        // 정답 도착
        if (begin.equals(target)) {
            answer = Math.min(answer, depth);
            return;
        }

        if (depth >= answer) return;


        for (int i = 0; i < words.length; i++) {

            if (!visited[i] && canChange(begin, words[i])) {

                visited[i] = true;
                dfs(words[i], target, words, depth + 1);
                visited[i] = false; //  백트래킹
            }
        }
    }

    private static boolean canChange(String begin, String word) {
        int diff = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != word.charAt(i)) {
                diff++;
            }
        }
        return diff==1;
    }
}
