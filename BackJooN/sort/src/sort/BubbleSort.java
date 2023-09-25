package sort;

/**
 * 버블정렬
 * - 인접한 두수 비교 후 큰 수를 뒤로 보내는 알고리즘
 *
 * 장점 : 구현이 쉽거, 직관적
 * 단점
 *  1.시간이 오래걸림
 *  2.최선. 최악, 평균 모두 O(n2)
 */

public class BubbleSort {
    public static void main(String[] args) {
        int ar[] = {6, 2, 3, 6, 2, 1, 3};
        int idx, tmp;
        for (int i = ar.length-1; i >=0; i--) { // 고장
                    for (int j = 0; j < i; j++) {
                        if (ar[j] > ar[j + 1]) {
                    tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }


    }
}
