import java.util.*;

class Solution {
        static HashMap<String, Integer> map;

    public String[] solution(String[] orders, int[] course) {
HashSet<String> set = new HashSet<>();
        for (int i = 0; i < orders.length; i++) {
            String[] split = orders[i].split("");
            for (int j = 0; j < split.length; j++) {
                set.add(split[j]);
            }
        }

        String[] arr = set.toArray(new String[0]);
        // 1. 처음부터 조합 재료를 알파벳순으로 정렬해둡니다.
        Arrays.sort(arr);

        LinkedList<String> list = new LinkedList<>();
        for (int c : course) {
            map = new HashMap<>();
            String[] res = new String[c];

            // 2. DFS 호출 시 시작 인덱스(start) 0을 넘겨줍니다.
            dfs(0, 0, c, arr, res, orders);

            int max = -1;
            for (String key : map.keySet()) {
                Integer value = map.get(key);
                max = Math.max(value, max);
            }

            for (String key : map.keySet()) {
                if (max == map.get(key)) {
                    list.add(key);
                }
            }
        }

        // 3. 프로그래머스 정답 조건: 정답은 알파벳 오름차순으로 정렬되어야 합니다.
        Collections.sort(list);
        return list.stream()
                .map(String::valueOf)
                .toArray(String[]::new);
    
    }
    
        private static void dfs(int start, int depth, int c, String[] arr, String[] res, String[] orders) {
        if (depth == c) {
            // arr이 이미 정렬되어 있으므로 res도 오름차순 정렬된 상태입니다.
            isRight(res, orders);
            return;
        }

        // 4. i는 항상 start부터 시작하도록 하여 중복 없는 조합을 만듭니다.
        for (int i = start; i < arr.length; i++) {
            res[depth] = arr[i];
            // 다음 문자는 현재 뽑은 문자 다음(i + 1)부터 탐색하도록 넘깁니다.
            dfs(i + 1, depth + 1, c, arr, res, orders);
        }
    }

    private static boolean isRight(String[] res, String[] orders) {
        int cnt = 0;
        // String JoinToRes = String.join("", res);

        for (int i = 0; i < orders.length; i++) {
            int size = 0;
            for (String re : res) {
                if (orders[i].contains(re)) {
                    size++;
                }
            }
            if (res.length == size) {
                cnt++;
            }
        }

        if (cnt >= 2) {
            String answer = String.join("", res);
            map.put(answer, cnt);
            return true;
        }
        return false;
    }
}