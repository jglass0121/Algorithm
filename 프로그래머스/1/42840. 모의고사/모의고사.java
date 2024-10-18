import java.util.LinkedList;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int oneCnt = 0, twoCnt = 0, threeCnt = 0;

        // 정답 배열과 비교
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) oneCnt++;
            if (answers[i] == two[i % two.length]) twoCnt++;
            if (answers[i] == three[i % three.length]) threeCnt++;
        }

        // 가장 많이 맞춘 사람 찾기
        int maxCnt = Math.max(oneCnt, Math.max(twoCnt, threeCnt));
        LinkedList<Integer> list = new LinkedList<>();

        // 최고 점수와 일치하는 사람을 리스트에 추가
        if (maxCnt == oneCnt) list.add(1);
        if (maxCnt == twoCnt) list.add(2);
        if (maxCnt == threeCnt) list.add(3);

        // 리스트를 배열로 변환하여 반환
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
