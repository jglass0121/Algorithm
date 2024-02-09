import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// int : 내림차순 x
// Integer : 내림차순 가능
public class 위에서_아래 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]+" ");
        }

    }
}
