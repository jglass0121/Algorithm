package th;

import java.util.Arrays;
import java.util.Scanner;

//binarySearch
public class 이분검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int solution = solution(N, M, arr);
        System.out.println(solution);


    }

    private static int solution(int n, int m, int[] arr) {
        int lt = 0;
        int rt = n - 1;
        Arrays.sort(arr);

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid]== m){
                return mid+1;
            } else if (arr[mid] > m) {
                rt = mid -1;
            } else {
                lt = mid +1;
            }

        }

        return -1;
    }

}
