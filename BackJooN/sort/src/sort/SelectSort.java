package sort;

/**
 * 선택정렬
 * - 장점 : 구현이 쉽다.
 * -단점 : 시간이 다른 정렬에 비해 오래 걸린다.
 *- 시간복작도 : O(n2)
 *
 */

public class SelectSort {
    public static void main(String[] args) {
        int ar[] = {6, 2, 3, 6, 2, 1, 3};
        int min, tmp;
        for (int i = 0; i < ar.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[min] > ar[j]) {
                    tmp = ar[min];
                    ar[min] = ar[j];
                    ar[j] = tmp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]+" ");
        }
        System.out.println();
    }

}
