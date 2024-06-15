import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        solution(num);
    }

    private static void solution(int num) {
        num /= 4;
        String res = "";
        for (int i = 0; i < num; i++) {
            res += "long ";
        }
        res += "int";
        System.out.println(res);
    }
}