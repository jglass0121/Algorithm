package th;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : solution(n, str)) {
            System.out.println(x);
        }
    }

    private static  ArrayList<String>  solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt){
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(s); // String화 시키기
            answer.add(temp);
            
        }
        return answer;
    }
}
