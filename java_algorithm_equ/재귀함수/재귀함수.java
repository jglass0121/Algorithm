public class 재귀함수 {
    public static void main(String[] args) {
        int n = 3;
        dfs(3);
    }

    private static void dfs(int n) {
        if(n == 0) return;
        dfs(n - 1);
        System.out.print(n+" ");
    }

}
