import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
  Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]}); // 인덱스. 우선순위
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHiger = false;
            for (int[] q : queue) {
                if (q[1] > current[1]) { // q값이 현재값보다 높을 경우
                    hasHiger = true;
                    break;
                }
            }

            if (hasHiger) {
                queue.add(current); //q값뒤에 넣기
            } else { // 아닐 경우
                answer++; // 실행 경ㄹ과
                if (current[0] == location) {
                    return answer;
                }

            }
        }


        return answer;
    }
}