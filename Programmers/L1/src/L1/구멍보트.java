package L1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 구멍보트 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        solution(people, limit);
    }

    private static void solution(int[] people, int limit) {
        Arrays.sort(people);

        int st = 0;
        int ed = people.length - 1;
        int cnt = 0;

        while (st <= ed) {
            if (people[st] + people[ed] <= limit) {
                st++; // 같이 탐
            }
            ed--; // 무거운 사람은 항상 탐
            cnt++; // 보트 1개 사용
        }

        System.out.println(cnt);

    }
}
