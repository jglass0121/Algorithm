import java.util.Arrays;
import java.util.Scanner;

public class 부분집합_구하기 {
    static int[] ch;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1];
        dfs(1);
    }

    private static void dfs(int L) {
        if (L == n + 1) {
            System.out.println("dept 결과 = " + L);
            System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch));

            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1 ) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);

            return;

        }else{
            System.out.println("L = " + L);
            System.out.println(Arrays.toString(ch));
            System.out.println();
            ch[L] = 1;
            dfs(L + 1);
            ch[L] = 0;
            dfs(L + 1);

        }

    }
}
