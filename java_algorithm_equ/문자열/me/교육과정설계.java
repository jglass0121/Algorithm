package me;

import java.util.Scanner;

public class 교육과정설계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();

        int pos = -1;

        String res= "YES";
        for (int i = 0; i < n.length(); i++) {
            int answer = m.indexOf(n.charAt(i), pos + 1);

            if(answer == -1){
                res = "NO";
                break;
            }

            pos = answer;

        }

        System.out.println(res);

    }
}
