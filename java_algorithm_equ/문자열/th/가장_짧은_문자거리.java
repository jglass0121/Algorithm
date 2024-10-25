package th;

import java.util.Scanner;

public class 가장_짧은_문자거리 {

    public static int[] solution(String str, char c){

        int[] answer = new int[str.length()];
        int p = 1000;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != c) p++;
            else p=0;
            answer[i] = p;
        }

        p = 1000;

        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) != c) {
                p++;
                if(answer[i] > p) answer[i] = p;
            } else {
                p=0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int a : solution(str, c)){
            System.out.print(a + " ");
        }

    }
}
