import java.util.Scanner;

/**
 * 이진 탐색
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("오름차순으로 입력하세요");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("검색할 값 : ");
        int find = sc.nextInt();

        int idx = search(arr, find);
        if (idx == -1) {
            System.out.println("검색 실패");
        } else {
            System.out.println(find+"는 arr["+idx+"] 에 있습니다.");
        }



    }

    /**
     * 이진 탐색
     *
     * @param arr
     * @param find
     * @return
     */
    private static int search(int[] arr, int find) {
        int p1 = 0; // 첫 인덱스
        int p2 = arr.length - 1; // 끝 인덱스

        do {
            int a = (p1 + p2) / 2;
            if (arr[a] == find) {
                return a;
            } else if (arr[a] > find) {
                p2 = a - 1;
            } else {
                p1 = a + 1;
            }

        } while (p1 <= p2);

        return -1;

    }
}