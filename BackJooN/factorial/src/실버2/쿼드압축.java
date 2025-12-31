package 실버2;

public class 쿼드압축 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };

        solution(arr);

    }
    static int[] answer;
    private static void solution(int[][] arr) {
        answer = new int[2];
        fac(arr, 0,0,arr.length);

    }

    private static void fac(int[][] arr, int x, int y, int size) {
        if (isSame(arr,x,y,size,arr[x][y])) {
            if(arr[x][y] == 1)
                answer[1]++;
            else answer[0]++;
            return ;
        }

        fac(arr, x, y, size/2);
        fac(arr, x+size/2, y, size/2);
        fac(arr, x, y+size/2, size/2);
        fac(arr, x+size/2, y+size/2, size/2);

    }

    private static boolean isSame(int[][] arr, int x, int y, int size, int val) {

        for (int i = x; i < x + size; i++) {
            for (int j = y; j <y+size; j++) {
                if(arr[i][j] != val){
                    return false;
                }
            }
        }
        return true;
    }
}
