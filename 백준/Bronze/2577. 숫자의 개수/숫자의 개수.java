import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        long res = (long) A * B * C; // 곱셈 결과
        String str = String.valueOf(res); // 문자열로 변환

        int[] arr = new int[10]; // 0~9 카운트 배열

        // 문자열 한 번만 순회하면서 카운트
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0'; // 문자 -> 숫자
            arr[num]++;
        }

        // 결과 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
