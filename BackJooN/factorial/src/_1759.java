import java.util.Arrays;
import java.util.Scanner;

public class _1759 {
    static boolean[] visited;
    static String[] mo = {"a", "e", "i", "o", "u"};
    static int a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] split = s.split(" ");
        Arrays.sort(split);
        visited = new boolean[b];

        fac(split, 0, "", 0);
    }

    private static void fac(String[] value, int cnt, String res, int prev) {

        if (cnt == a) {
            //모음이 포함되면 출력
            String word = "";
            int a = 0;
            int b = 0;
            String[] split = res.split("");

            for (int i = 0; i < split.length; i++) {
                if (split[i].equals("a") || split[i].equals( "e") || split[i].equals("i") || split[i].equals("o") || split[i].equals("u") ){
                    a++;
                } else {
                    b++;
                }
            }


            if (a >= 1 && b >= 2) {
                System.out.println(res);
            }

            return;

        }


        for (int i = 0; i < value.length; i++) {

            if (!visited[i] && i >= prev) {
                visited[i] = true;
                fac(value, cnt + 1, res + value[i], i);
                visited[i] = false;
            }

        }

    }
}
