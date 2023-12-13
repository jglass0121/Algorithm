import java.util.Scanner;

public class 초콜릿식사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = 1;
        int cnt = 0;
        int size2 = 0;

        while (size < k) {
            size = size * 2;
            size2 = size;
        }

        while (k > 0) {
            if (k >= size) {
                k -= size;
            } else {
                size /= 2;
                cnt++;
            }
        }

        System.out.println(size2 + " " + cnt);


    }
}
