import java.util.Scanner;

public class 특정_문자_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String solution = solution(str);
        System.out.println(solution);
    }

    private static String solution(String str) {
        int lt = 0, rt = str.length() - 1;
        char[] toChar = str.toCharArray();
        while(lt<rt){
            char l = toChar[lt];
            char r = toChar[rt];
            if (!Character.isAlphabetic(l)) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(r)) {
                rt--;
                continue;
            }
            //둘다 알파벳일 경우. swap
            char temp = l;
            toChar[lt] = r;
            toChar[rt] = temp;
            lt++;
            rt--;


        }

        String string = String.valueOf(toChar);
        return string;
    }

}
