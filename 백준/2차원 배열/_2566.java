import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        int max = 0;
        int colume = 0;
        int row = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    colume = j;

                }
            }
        }


        StringBuilder sb = new StringBuilder();

        System.out.println(max);
        sb.append(row + 1).append(" ").append(colume + 1);
        System.out.println(sb);


    }
}
