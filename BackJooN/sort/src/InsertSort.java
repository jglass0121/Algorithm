/**
 * 삽입정렬
 * :저장한 값의 삽입할 위치를 찾아 정렬하는 방법
 *
 * - 시간복잡도 : O(n2)
 */
public class InsertSort {
    public static void main(String[] args) {
        int ar[] = {6, 2, 3, 6, 2, 1, 3};
        int idx, tmp;
        for (int i = 1; i < ar.length; i++) {
            idx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (ar[idx] < ar[j]) {
                    tmp = ar[idx];
                    ar[idx] = ar[j];
                    ar[j] = tmp;
                    idx = j; // 중요 - 계속 뒤에있는  수와 비교하기위해 바뀌어 줘야함
                } else {
                    break;
                }
            }

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }

    }

}
