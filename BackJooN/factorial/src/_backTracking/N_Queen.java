package _backTracking;


public class N_Queen {
    static int N;
    static int[] arr;
    static int cnt = 0;
    public static void main(String[] args) {
        N = 8;
        arr = new int[N];
        nQueens(0);
    }

    private static void nQueens(int depth) {
        if (depth == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (check(depth)) {
                nQueens(depth + 1);
            }
        }
    }

    private static boolean check(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[depth] == arr[i]) {
                return false;
            } else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) {
                return false;
            }


        }
        return true;
    }
}
