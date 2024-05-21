class Solution {
    public void reverseString(char[] s) {
        reverseHelper(s, 0, s.length - 1);

    }
    
private void reverseHelper(char[] s, int left, int right) {
        // 기저 조건: 왼쪽 인덱스가 오른쪽 인덱스보다 크거나 같으면 종료
        if (left >= right) {
            return;
        }

        // 왼쪽과 오른쪽을 스왑
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // 다음 부분을 재귀적으로 뒤집음
        reverseHelper(s, left + 1, right - 1);
    }
}