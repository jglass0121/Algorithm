package 실버5;

import java.util.Scanner;

public class 방_번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        int res = 0;
        int[] visited = new int[10];
        String str = "" + num;

        // 모든 숫자에 값 증가
        int findNum = 0;
        for (int i = 0; i < str.length(); i++) {
            findNum = str.charAt(i) - '0';
            if (findNum == 9) {
                findNum = 6;
            }
            visited[findNum]++;
        }


        // 6과 9계산 - 서로 바뀌어도 한세트로
        visited[6] = visited[6] / 2  +visited[6]%2;

        int max = visited[6];
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, visited[i]);
        }
        System.out.println(max);

    }
}
