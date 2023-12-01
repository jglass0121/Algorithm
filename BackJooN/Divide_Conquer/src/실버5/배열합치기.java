package 실버5;

import java.util.*;

public class 배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        sc.nextLine();
        int total = one + two;
        int[] arr = new int[total];
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < one; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i <two; i++) {
            arr[i + one] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int r :
                arr) {
            sb.append(r + " ");
        }
        System.out.println(sb);

    }
}
