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
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);

        }
        return answer;
    }
}
