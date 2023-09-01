import java.util.Scanner;

public class 곱하기혹은더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //0과 1제외  곱하기
        String[] split = s.split("");
        int result =Integer.parseInt(split[0]);
        for (int i = 1; i < split.length; i++) {
            int one = Integer.parseInt(split[i]);
            System.out.println("one = " + one);
            if (one <=1 || result<=1) {
                result += one;
                continue;
            }
            else {
                result *= one;
            }
        }

    }
}
