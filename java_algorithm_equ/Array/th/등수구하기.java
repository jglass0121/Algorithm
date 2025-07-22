package th;

import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int n : solution(num, arr)) {
            System.out.print(n+" ");

        }
    }

    private static int[] solution(int num, int[] arr) {
        int[] answer = new int[num];
        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
