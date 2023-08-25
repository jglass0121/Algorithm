import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class 부품찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int[] arr1 = new int[one];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < one; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            set.add(arr1[i]);
        }

        int two = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr2 = new int[two];
        for (int i = 0; i < two; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            if (set.contains(arr2[i])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}
