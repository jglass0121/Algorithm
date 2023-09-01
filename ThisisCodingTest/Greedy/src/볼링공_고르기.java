import java.util.LinkedList;
import java.util.Scanner;

public class 볼링공_고르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);


        int[] arr = new int[11];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] += 1;
        }

        int result = 0;

        // 1부터 m까지의 각 무게에 대하여 처리
        for (int i = 1; i <= m; i++) {
            n -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            result += arr[i] * n; // B가 선택하는 경우의 수와 곱해주기
        }

        System.out.println(result);

    }

}
