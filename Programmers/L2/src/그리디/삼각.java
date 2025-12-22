package 그리디;

class Solution {
    public int[] solution(int n) {

        int[][] arr = new int[n][n];
        int num = 1;
        int x = -1;
        int y = 0;

        // 삼각형 채우기
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {          // 아래
                    x++;
                } else if (i % 3 == 1) {   // 오른쪽
                    y++;
                } else {                   // 대각선 위
                    x--;
                    y--;
                }
                arr[x][y] = num++;
            }
        }

        // 결과를 1차원 배열로 변환
        int[] answer = new int[num - 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = arr[i][j];
            }
        }

        return answer;
    }
}
