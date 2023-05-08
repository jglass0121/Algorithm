import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _25501 {
    static int count = 0;
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        int recursion = recursion(s, 0, s.length() - 1);
        return recursion;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i1 = Integer.parseInt(br.readLine());


        for (int i = 0; i < i1; i++) {
            String s = br.readLine();
            sb.append(isPalindrome(s)).append(" ").append(count).append("\n");
            count = 0;
        }
        System.out.println(sb);
    }
}
