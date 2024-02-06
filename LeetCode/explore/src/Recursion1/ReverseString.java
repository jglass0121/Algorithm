package Recursion1;

public class ReverseString {
    public static void main(String[] args) {
        String[] s = {"h", "e", "l", "l", "o"};
        solution(s);
    }

    private static void solution(String[] s) {
        fac(s, 0, s.length - 1);
    }

    private static void fac(String[] s, int left,int right
    ) {
        // 기저 조건: 왼쪽 인덱스가 오른쪽 인덱스보다 크거나 같으면 종료
        if (left >= right) {
            return;
        }

        // 왼쪽과 오른쪽을 스왑
        String temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // 다음 부분을 재귀적으로 뒤집음
        fac(s, left + 1, right - 1);

    }
}
