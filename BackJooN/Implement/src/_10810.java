import java.util.Scanner;

public class _10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[a+1];
        for (int i = 0; i < b; i++) {
            String[] split = sc.nextLine().split(" ");
            int one = Integer.parseInt(split[0]);
            int two = Integer.parseInt(split[1]);
            int tree = Integer.parseInt(split[2]);
            for (int j = one; j <= two; j++) {
                arr[j] = tree;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }



}
