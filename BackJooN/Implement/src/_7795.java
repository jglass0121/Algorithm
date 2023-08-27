import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] arr1 = new int[a];
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < split.length; j++) {
                arr1[j] = Integer.parseInt(split[j]);
            }

            int[] arr2 = new int[b];
            String[] split2 = br.readLine().split(" ");
            for (int j = 0; j < split2.length; j++) {
                arr2[j] = Integer.parseInt(split2[j]);
            }


            //  c : 1 1 3 7  8
            //  d : 1 3 6
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int result = 0;
            for (int j = 0; j < arr1.length; j++) {
                int c =  arr1[j];
                for (int k = 0; k < arr2.length; k++) {
                    int d =  arr2[k];
                    if (c <= d) {
                        break;
                    } else {
                        result++;
                    }
                }
            }

            System.out.println(result);


        }

    }
}
