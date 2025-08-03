import java.util.Arrays;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        int cnt = 0 ;
        for (int i = 0; i < S.length() - T.length()+1; i++) {
            String[] subS = S.substring(i, i+T.length()).split("");
            Arrays.sort(subS);
            String[] subT = T.split("");
            Arrays.sort(subT);
            boolean equals = Arrays.equals(subS, subT);
            if (equals) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
