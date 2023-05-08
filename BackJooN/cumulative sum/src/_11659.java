import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt( st.nextToken());
        Integer M = Integer.parseInt( st.nextToken());

        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i-1]+  Integer.parseInt( st.nextToken());

        }

        int sum = 0;
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
             int a= Integer.parseInt( st.nextToken());
             int b= Integer.parseInt( st.nextToken());
            System.out.println(arr[b]-arr[a-1]);

        }


    }

}
