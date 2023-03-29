import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[one][two];
        int[][] arr2 = new int[one][two];


        for (int i = 0; i < one; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < two; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < one; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < two; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < one; i++) {
            for (int j = 0; j < two; j++) {
                sb.append(arr1[i][j] += arr2[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}
