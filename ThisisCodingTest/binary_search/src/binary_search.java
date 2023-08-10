import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("오름차순");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값");
        int search = sc.nextInt();

        System.out.println(binarySearch(search,0,arr.length-1,arr));
    }

    private static int binarySearch(int search, int start, int end,int[] arr) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                start = mid+1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }
}
