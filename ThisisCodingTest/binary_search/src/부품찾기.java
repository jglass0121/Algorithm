import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 부품찾기
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int[] arr1 = new int[one];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < one; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int two = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr2 = new int[two];
        for (int i = 0; i < two; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < two; i++) {
            int find = arr2[i];
            int result = Arrays.binarySearch(arr1, find);
            if (result == -1) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

    }
}
