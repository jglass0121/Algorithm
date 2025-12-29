package me;

import java.util.*;
// 오답
public class 등수구하기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        String solution = solution(arr, num);
        System.out.println(solution.trim());

    }

    private static String solution(int[] arr, int num) {
        // 점수 내림차순 정렬
        Integer[] sorted = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        for (int i = 0; i < num; i++) {
            // 아직 등수가 할당되지 않은 점수라면 등록
            map.putIfAbsent(sorted[i], rank);
            rank++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        return sb.toString();
    }
}
