import java.util.Arrays;
import java.util.Scanner;

public class _11265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int partySize = sc.nextInt();
        int Scnt = sc.nextInt();

        int[][] arr = new int[partySize][partySize];

       // Arrays.fill(arr, 501);
        for (int i = 0; i < partySize; i++) {
            for (int j = 0; j < partySize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < partySize; k++) {
            for (int i = 0; i < partySize; i++) {
                for (int j = 0; j < partySize; j++) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }


        for (int i = 0; i < Scnt; i++) {
            int now = sc.nextInt();
            int nextNum = sc.nextInt();
            int time = sc.nextInt();

            int canGo = arr[now-1][nextNum-1];
            if (canGo <= time) {
                System.out.println("Enjoy other party");
            } else {
                System.out.println("Stay here");

            }



        }

    }
}
