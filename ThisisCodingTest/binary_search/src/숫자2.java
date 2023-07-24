import java.util.Arrays;
import java.util.Scanner;

public class 숫자2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int[] arr1 = new int[one];
        for (int i = 0; i < one; i++) {
            arr1[i] = sc.nextInt();

        }


        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        int two = sc.nextInt();
        int[] arr2 = new int[two];
        for (int i = 0; i < two; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int j = 0; j < arr2.length; j++) {
            int num = arr2[j];

            int lower = lower(num, arr1);
            int upperbinary = upper(num,arr1);
            int i = upperbinary - lower;
            arr2[j] = i;

        }
        System.out.println(Arrays.toString(arr2));
        }

    private static int lower(int target, int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (target <= arr[mid]) {
                end = mid;
                // 하한선을 내려줘서 target 왼쪽 값들 중dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart
                // target 이상인 것들 중 가장 작은 인덱스 탐색
            } else {
                start = mid + 1;
            }

        }
        return end;

    }


    public static int upper(int target, int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid; // 하한선을 내려줘서 target 왼쪽 값들 중
                // target을 초과하는 값들 중 가장 작은 값/인덱스 찾아주기
            } else {
                start = mid + 1;
            }
        }
        return end;

    }
}
