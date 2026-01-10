import java.util.Scanner;

// DP
public class 팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new int[num + 1];
        arr[0] = 0;
        arr[1] =1;
        System.out.println(fac(num));

    }

    public static int[] arr;

    private static int fac(int num) {
        if(num == 1){
            return 1;
        }
        if(arr[num]!=0) return arr[num];

        arr[num] =  num *  fac(num - 1);
        return arr[num];

    }
}
