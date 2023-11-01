package _backTracking;

import java.util.Scanner;

public class _10597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean[] used = new boolean[51]; // 1부터 50까지의 숫자 중 사용된 숫자를 체크하는 배열
        StringBuilder output = new StringBuilder(); // 결과를 저장할 문자열

        solve(input, used, 1, output);
        System.out.println(output);
    }

    // 재귀 함수를 이용하여 가능한 순열을 찾는 함수
    public static boolean solve(String input, boolean[] used, int index, StringBuilder output) {
        if (index == input.length() + 1) {
            return true; // 모든 숫자를 사용했을 때 종료 조건
        }

        if (input.charAt(index - 1) == '0') {
            return false; // 0으로 시작하는 숫자는 사용 불가능
        }

        int num = 0;
        for (int i = index  - 1; i < input.length(); i++) {
            num = num * 10 + (input.charAt(i) - '0');

            if (num > 50) {
                break; // 50을 초과하는 숫자는 사용 불가능
            }

            if (!used[num]) { // false
                used[num] = true;
                output.append(num).append(' ');

                if (solve(input, used, i + 2, output)) { // 0인지 체크
                    return true;
                }

                used[num] = false;
                output.delete(output.length() - String.valueOf(num).length() - 1, output.length()); //이전으로 복구를 위해
            }
        }

        return false;
    }
}
