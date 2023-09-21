import org.w3c.dom.css.CSSUnknownRule;

import java.util.Scanner;

public class _2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int one = Integer.parseInt(split[0]);
        int two = Integer.parseInt(split[1]);
        int[] arr = new int[one];
        String[] split2 = sc.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split2[i]);
        }

        int res = 0;
        int sum = 0;
        for (int i = 0; i < one; i++) {
            if (arr[i] == two) {
                res++;
                continue;
            }

            sum += arr[i];

            for (int j = i+1; j <one ; j++) {
                 sum+=arr[j];
                if (sum > two) {
                    break;
                }


                if (sum == two) {
                    res++;
                    break;
                }

            }
            sum = 0;
        }
        System.out.println(res);

    }
}

