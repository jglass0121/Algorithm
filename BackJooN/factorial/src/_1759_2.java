import java.io.*;
import java.util.*;

public class _1759_2 {
    static int L,C;
    static String[] pwd,alpha;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        L = Integer.parseInt(str1[0]);    // 암호 길이
        C = Integer.parseInt(str1[1]);    // 암호에 사용될 알파벳 갯수

        pwd= new String[L];
        alpha = new String[C];

        alpha = br.readLine().split(" ");
        Arrays.sort(alpha);
        combin(0,0);

    }// main()

    static void combin(int len, int start) {


        if(len>=L) {
            if(check(pwd)) { // 모음 자음 체크
                for(String p : pwd) {
                    System.out.print(p);
                }
                System.out.println();
            }
            return;
        }

        for(int i=start; i<C;i++) {
            pwd[len]=alpha[i];

            int len1 = len + 1;
            int start1 = i + 1;

            System.out.println("len : "+len1+" start1 = " + start1);
            combin(len1, start1);
        }
    }
    //combin()
    static boolean check (String[] pw) {
        int c =0; //자음
        int v =0; //모음
        for (int i = 0; i < pwd.length; i++) {
            if(pwd[i].equals("a")||pwd[i].equals("e")||pwd[i].equals("i")||pwd[i].equals("o")||pwd[i].equals("u"))
                v++;
            else
                c++;
        }
        if(c >=2 && v>=1) return true;
        else return false;
    }//check()
}// class Main