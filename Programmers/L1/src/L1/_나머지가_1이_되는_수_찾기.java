package L1;

public class _나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        int n = 10;
        solution(n);
    }

    private static int solution(int n) {

        int find = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                find = i;
                break;
            }
        }
        if (find > 0) {
            return find;
        }
        return 0;
    }
}
