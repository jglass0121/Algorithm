import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
      // 귤 크기별 개수를 담을 Map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        // 크기별 개수를 내림차순 정렬
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int answer = 0;
        int total = 0;

        // 귤의 크기를 최소화하면서 K개 선택
        for (Map.Entry<Integer, Integer> entry : entryList) {
            total += entry.getValue(); // 현재 크기의 귤 추가
            answer++; // 크기 추가
            if (total >= k) {
                break;
            }
        }
        
        return answer;
    }
}