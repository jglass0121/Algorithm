package L3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 보석쇼핑 {
    public static void main(String[] args) {
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        solution(gems);
    }

    private static int[] solution(String[] gems) {
        int kind = new HashSet<>(Arrays.asList(gems)).size();
        int start = 0;
        int end = 0;


        HashMap<String, Integer> gemCount = new HashMap<>();
        int[] answer = {0, gems.length - 1};
        while (end < gems.length) {
            //현재 보석을 맵에 추가
            gemCount.put(gems[end], gemCount.getOrDefault(gems[end], 0) + 1);
            System.out.println("gemCount = " + gemCount);
            while (gemCount.size() == kind) { // 모든 종류의 보석이 포함되면
                if (end - start < answer[1] - answer[0]) { // 길이가 더 짧다면
                    answer[0] = start; // 갱신
                    answer[1] = end;
                }

                //시작 지점의 보석을 하나 빼고, 개수가 0이되면 제거
                if (gemCount.get(gems[start]) > 1) { //start앞으로 가기 위ㅐ 
                    gemCount.put(gems[start], gemCount.get(gems[start]) - 1); //하나뺌
                } else {
                    gemCount.remove(gems[start]); // 아예 삭제
                }
                start++; // 시작 지점 한칸 옯김
            }
            end++; //끝지점 한칸 옮김
        }

        return new int[]{answer[0] + 1, answer[1] + 1};

    }

}
