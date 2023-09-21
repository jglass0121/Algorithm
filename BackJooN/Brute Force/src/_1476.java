import java.util.Scanner;

public class _1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        System.out.println("split[0] = " + split[0]);
        System.out.println("split[0] = " + split[1]);
        System.out.println("split[0] = " + split[2]);

        int e=0, s=0, m=0;
        int res = 0;
        while (true) {

            e++;
            s++;
            m++;
            res++;
            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }

            if (e == Integer.parseInt(split[0]) && s == Integer.parseInt(split[1]) && m == Integer.parseInt(split[2])) {
                System.out.println(res);
                break;
            }


        }


    }
}
