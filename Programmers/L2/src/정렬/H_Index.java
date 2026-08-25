package 정렬;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        solution(citations);
    }

    private static int solution(int[] citations) {

        Arrays.sort(citations);
        for (int i = citations.length ; i >= 0; i--) { // 5
            // 5

            int cnt = 0;
            for (int j = citations.length - 1; j >= 0; j--) {
                if (citations[j] >= i) {
                    cnt++;
                } else {
                    break; // 정렬되어 있으므로 i보다 작아지면 중단
                }
            }

// i번 이상 인용된 논문이 i편 '이상'인지 확인
            if (cnt >= i) {
                return i;
            }
        }
        return 0;
    }
}
