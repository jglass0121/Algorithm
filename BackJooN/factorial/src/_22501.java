import java.util.Scanner;

public class _22501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            int palindrome = isPalindrome(str);
            System.out.println(palindrome + " " + res);

        }
    }

    static int res;
    public static int recursion(String s, int l, int r){
        res++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

}
