package 실버1;

import java.util.Arrays;
import java.util.Scanner;

public class 기타레슨 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 레슨의 수
        int M = sc.nextInt();  // 그룹의 수
        int[] lessons = new int[N];  // 레슨의 길이를 저장하는 배열

        // 입력받은 레슨의 길이를 배열에 저장
        for (int i = 0; i < N; i++) {
            lessons[i] = sc.nextInt();
        }

        // 이분 탐색을 위해 정렬
        Arrays.sort(lessons);

        // 이분 탐색을 위한 시작과 끝 범위 설정
        int start = lessons[N - 1];  // 가장 긴 레슨의 길이
        int end = Arrays.stream(lessons).sum();  // 모든 레슨의 길이 합

        // 이분 탐색 수행
        while (start <= end) {
            int mid = (start + end) / 2;  // 중간 값

            // 현재 중간 값으로 레슨을 그룹으로 나눴을 때, 그룹의 수 계산
            int groupCount = countGroups(lessons, mid);

            // 그룹의 수가 주어진 그룹의 수보다 작거나 같으면 더 작은 값을 찾기 위해 범위 축소
            if (groupCount <= M) {
                end = mid - 1;
            }
            // 그룹의 수가 주어진 그룹의 수보다 크면 더 큰 값을 찾기 위해 범위 축소
            else {
                start = mid + 1;
            }
        }


        System.out.println("end = " + end);

        // 최적의 그룹을 찾아서 출력
        System.out.println(start);
    }

    // 레슨을 주어진 길이로 그룹으로 나눴을 때의 그룹의 수 계산
    private static int countGroups(int[] lessons, int length) {
        int count = 1;  // 그룹의 수
        int sum = 0;    // 현재 그룹의 레슨 길이 합

        for (int lesson : lessons) {
            // 현재 그룹의 레슨 길이 합이 주어진 길이를 넘어가면 새로운 그룹으로 시작
            if (sum + lesson > length) {
                count++;
                sum = 0;
            }
            sum += lesson;
        }

        return count;
    }
}
