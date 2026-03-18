import java.util.Scanner;

public class 팩토리얼2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fac = fac(num);
        System.out.println(fac);
    }

    private static long fac(int num) {
        if(num <= 1) return 1;
        return num * fac(num-1);
    }
}
