import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 두배열의_원소교체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        int[] arr1 = new int[a];
        int[] arr2 = new int[a];

        String[] s = sc.nextLine().split(" ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=Integer.parseInt(s[i]);
        }
        String[] s2 = sc.nextLine().split(" ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=Integer.parseInt(s2[i]);
        }

        arr1 =  Arrays.stream(arr1).sorted().toArray();
        arr2= Arrays.stream(arr2).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < b; i++) {
            if (arr1[i] < arr2[i]) {
                arr1[i] = arr2[i];
            }
        }

        int sum = Arrays.stream(arr1).sum();
        System.out.println("sum = " + sum);


    }

}
