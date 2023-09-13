import java.util.LinkedList;
import java.util.Scanner;

/**
 * _10819(차이를 _최대로)
 *
 */
public class _10819
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();


        String[] split = sc.nextLine().split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < split.length; i++) {
            arr[i] =  Integer.parseInt(split[i]);
        }


        int max = 0;
        int abs = 0;
        for (int i = 0; i < list.size()-1; i++) {
            abs = Math.abs(arr[i] - arr[i + 1]);

        }



    }
}
