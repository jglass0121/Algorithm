package 완전탐색;

import java.util.HashSet;

public class 소수찾기 {
    public static void main(String[] args) {
        String numbers = "17";
        solution(numbers);
    }

    private static int solution(String numbers) {

        //back_track
        String[] arr = numbers.split("");
        visited = new boolean[arr.length];
        value = new HashSet<>();
        back(arr, 0, "");


        return value.size();

    }

    static boolean[] visited;
    static HashSet<Integer> value;

    private static void back(String[] arr, int depth, String answer) {
        if (!answer.isEmpty()) {
            //prime인지 생각하고 set에 저장
            int num = Integer.parseInt(answer);
            if (isPrime(num)) {
                value.add(num);
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                back(arr, depth + 1, answer + arr[i]);
                visited[i] = false;
            }
        }

    }

    private static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

}
