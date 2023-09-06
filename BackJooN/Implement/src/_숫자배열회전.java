import java.util.Scanner;

public class _숫자배열회전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            int[][] arr = new int[num2][num2];

            for (int j = 0; j < num2; j++) {
                for (int k = 0; k < num2; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            int[][] result_90 = Rotation(arr);
            int[][] result_180 = Rotation(result_90);
            int[][] result_270 = Rotation(result_180);

            System.out.println("#"+num+" ");
            for (int j = 0; j < num2; j++) {
                for (int k = 0; k < num2; k++) {
                    System.out.print(result_90[j][k]);
                }
                System.out.print(" ");

                for (int k = 0; k < num2; k++) {
                    System.out.print(result_180[j][k]);
                }
                System.out.print(" ");

                for (int k = 0; k < num2; k++) {
                    System.out.print(result_270[j][k]);
                }
                System.out.print(" ");
            }

        }
    }

    private static int[][] Rotation(int[][] arr) {
        int[][] result = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[arr.length - j - 1][i];
            }
        }
        return result;
    }

}
