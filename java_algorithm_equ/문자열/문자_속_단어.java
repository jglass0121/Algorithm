import java.util.Arrays;
import java.util.Scanner;

public class 문자_속_단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");


        int max = 0;
        String answer  = "";
        for (int i = 0; i < split.length; i++) {
            int length = split[i].length();
            if(max < length){
                max = length;
                answer = split[i];
            }

        }
        System.out.println(answer);

    }
}
