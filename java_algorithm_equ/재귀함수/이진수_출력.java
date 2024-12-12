public class 이진수_출력 {
    public static void main(String[] args) {
        dfs(11);
    }

    private static void dfs(int n) {
        int dab = n / 2;
        int div = n % 2;

        if (n == 0) {
            return;
        }
        dfs(dab);
        System.out.print(div);

    }
}
