package th;

import java.util.*;

class 공통원소_구하기 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a); // 입력받은 배열을 오름차순 정렬한다
        Arrays.sort(b); // 입력받은 배열을 오름차순 정렬한다
        int p1 = 0, p2 = 0; // 2개의 포인트를 0부터 시작하도록 선언한다
        while (p1 < n && p2 < m) { // 두개의 포인터중 길이가 넘칠경우 정지하는 루프 시작
            if (a[p1] == b[p2]) { //두개의 값이 같으면 (교집합이면)
                answer.add(a[p1++]); // 두 포인터 증가
                p2++; // 두 포인터 증가
            } else if (a[p1] < b[p2])
                p1++; // 더 작은쪽의 포인터를 증가
            else
                p2++; // 더 작은쪽의 포인터를 증가
        }
        return answer;
    }

    public static void main(String[] args) {
        공통원소_구하기 T = new 공통원소_구하기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b))
            System.out.print(x + " ");
    }
}