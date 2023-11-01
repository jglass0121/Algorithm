import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("num = " + num);
        int cer = sc.nextInt();
        System.out.println("cer = " + cer);
        int arr[][] = new int[num + 1][4];
        int rank = 1;

        sc.nextLine();
        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int index = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[index][0] = g;
            arr[index][1] = s;
            arr[index][2] = b;
        }

        for (int i = 0; i <= num; i++) {
            if (arr[i][0] > arr[cer][0]) {
                //그메달 더 많음
                rank++;
            } else if (arr[i][0] == arr[cer][0] && arr[i][1] > arr[cer][1]) {
                //금메달 같고, 은메달 수 다름
                rank++;
            } else if (arr[i][0] == arr[cer][0] && arr[i][1] == arr[cer][1]
                    && arr[i][2] > arr[cer][2]) {
                rank++;
            }
        }

        System.out.println("rank = " + rank);
        sc.close();

    }
}
