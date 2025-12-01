class Solution {
    public int[][] solution(int[][] A, int[][] B) {
        
          int aRows = A.length;
        int aCols = A[0].length;
        int bCols = B[0].length;
        
        int[][] answer = new int[aRows][bCols];
        
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                for (int k = 0; k < aCols; k++) {
                    answer[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return answer;
    
    }
}