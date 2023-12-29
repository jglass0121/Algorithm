import java.util.Scanner;

public class 연산자끼워넣기 {
    public static int MAX = Integer.MIN_VALUE;    // 최댓값
    public static int MIN = Integer.MAX_VALUE;    // 최솟값
    public static int[] operator = new int[4];    // 연산자 개수
    public static int[] number;                    // 숫자
    public static int N;                        // 숫자 개수
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N =  sc.nextInt();
        number = new int[N];
    }
}
