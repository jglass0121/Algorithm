import java.util.Scanner;

public class 자물쇠와_열쇠 {
    public static void main(String[] args) {
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        solution(key, lock);

    }

    // 한칸이라도 겹치는 것으로 시작
    private static boolean solution(int[][] key, int[][] lock) {
        int offset = key.length - 1;


        for (int r = 0; r <offset+ lock.length; r++) {
            for (int c = 0; c < offset + lock.length; c++) {
                for (int rot = 0; rot < 4; rot++) { // 회전
                    int[][] arr = new int[58][58];
                    for (int i = 0; i < lock.length; i++) {
                        for (int j = 0; j < lock.length; j++) {
                            arr[offset + i][offset + j] = lock[i][j];
                        }
                    }
                    match(arr, key, rot, r, c);
                    if(check(arr,offset,lock.length)){
                        return true;
                    }
                }
            }
        }
        return false;

    }

    private static boolean check(int[][] arr, int offset, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[offset + i][offset + j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void match(int[][] arr, int[][] key, int rot, int r, int c) {
        int n = key.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rot == 0) {
                    arr[r + i][c + j] += key[i][j];
                } else if (rot == 1) {
                    arr[r + i][c + j] += key[j][n - 1 - i];
                } else if (rot == 2) {// 180도
                    arr[r + i][c + j] += key[n - 1 - i][n - 1 - i];
                } else {
                    arr[r + i][c + j] += key[n - 1 - j][i];
                }

            }
        }
    }

}
