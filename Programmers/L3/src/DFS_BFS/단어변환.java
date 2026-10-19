package DFS_BFS;

public class 단어변환 {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        solution(begin, target, words);

    }

    private static void solution(String begin, String target, String[] words) {
        String[] beginSplit = begin.split("");
        String[] targetSplit = target.split("");

        visited = new boolean[words.length];
        int dfs = dfs(0, beginSplit, targetSplit, words);
        System.out.println("dfs = " + dfs);
    }

    static boolean[] visited;

    private static int dfs(int depth, String[] begin, String[] target, String[] words) {
        if (begin.equals(target)) {
            System.out.println("depth = " + depth);
            return depth;
        }

        for (int i = 0; i < words.length; i++) {
            // 사용함 , -> 어떤 인덱스를 사용하나
            for (int j = 0; j < words[i].length(); j++) {
                if (begin[j] != target[j]) {
                    begin[j] = target[j];
                    dfs(depth + 1, begin, target, words);
                } // 같은 경우는 안해도 됨
            }

            //사용하지 않음


        }
        return 0;
    }
}
