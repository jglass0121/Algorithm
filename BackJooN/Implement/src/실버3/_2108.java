package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers); // 숫자를 정렬하여 중앙값 계산을 쉽게 함

        // 평균 계산
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println(Math.round(average)); // 반올림하여 정수로 출력

        // 중앙값 계산
        int median = numbers[N / 2];
        System.out.println(median);

        // 최빈값 계산
        int[] count = new int[8001]; // 숫자 범위: -4000 ~ 4000
        int maxCount = 0;

        for (int number : numbers) {
            count[number + 4000]++;
            maxCount = Math.max(maxCount, count[number + 4000]);
        }

        int mode = 0;
        boolean isSecond = false; // 두 번째로 작은 최빈값을 확인하기 위한 플래그

        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                if (isSecond) {
                    mode = i - 4000;
                    break;
                }
                mode = i - 4000;
                isSecond = true;
            }
        }

        System.out.println(mode);

        // 범위 계산
        int range = numbers[N - 1] - numbers[0];
        System.out.println(range);
    }
}
