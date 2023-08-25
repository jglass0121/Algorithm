import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 부품찾기2
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
            Arrays.sort(arr1);

            int result = search(find,arr1);
            if (result == -1) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

    }
    //1 2 3 4 5

    private static int search(int find, int[] arr1) {
        int start = 0;
        int end = arr1.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr1[mid] == find) {
                return 1;
            } else if (arr1[mid] > find) {
                end = mid- 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
