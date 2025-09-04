package me;

import java.util.*;

public class 회문문자열 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        if (solution(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean solution(String str){
        String lowStr = str.toLowerCase();
        int s =0, e= str.length()-1;
        while(s < e ){
            char startChar = lowStr.charAt(s);
            char endChar = lowStr.charAt(e);
            if(startChar != endChar){
                return false;
            }
            s++;
            e--;
        }
        return true;

    }
}