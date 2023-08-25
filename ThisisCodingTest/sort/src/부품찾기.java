import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 부품찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int[] num = new int[10000001];
        int[] arr1 = new int[one];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < one; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            num[arr1[i]] +=1;
        }

        int two = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr2 = new int[two];
        for (int i = 0; i < two; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            int res = num[arr2[i]];
            if (res != 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }


    }
}
