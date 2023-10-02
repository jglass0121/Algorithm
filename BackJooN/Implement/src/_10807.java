import java.util.Arrays;
import java.util.Scanner;

public class _10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  =  sc.nextInt();
        sc.nextLine();


        String[] split = sc.nextLine().split(" ");
        String s = sc.nextLine();
        long count = Arrays.stream(split).filter(i -> i.equals(s)).count();
        System.out.println(count);


    }
}
