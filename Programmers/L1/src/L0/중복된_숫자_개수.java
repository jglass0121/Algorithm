package L0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 중복된_숫자_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr  = {1, 1, 2, 3, 4, 5};
        int num = Integer.parseInt(br.readLine());

        int solution = solution(arr, num);
        System.out.println("solution = " + solution);
    }
    public static int solution(int[] array, int n) {

        return (int) Arrays.stream(array).filter(e -> e == n).count();

    }
}
