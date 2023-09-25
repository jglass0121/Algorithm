package etc;

import java.util.*;

public class sort_findfirst {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] twoDArray = {
                {5, 2},
                {9, 1},
                {3, 7}
        };

        OptionalInt maxOptional = Arrays.stream(twoDArray)
                .sorted((a, b) -> b[0] - a[0])  // 내림차순 정렬
                .mapToInt(i -> i[0])            // 첫 번째 열만 선택
                .findFirst();                   // 첫 번째 값을 가져옴

        if (maxOptional.isPresent()) {
            int max = maxOptional.getAsInt();
            System.out.println("가장 큰 값: " + max);
        } else {
            System.out.println("배열이 비어 있습니다.");
        }
    }
}
