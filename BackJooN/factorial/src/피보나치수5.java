import java.util.Scanner;

public class 피보나치수5 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new int[num+1];
        int fac = fac(num);
        System.out.println(fac);
    }

    private static int fac(int num ) {
        if (num == 0 ){
            return 0;
        }
        if(num ==1){
            return 1;
        }

        if(arr[num]!= 0){
            return arr[num];
        }


        arr[num] = fac(num - 1) + fac(num - 2);
        return arr[num];


    }
}
