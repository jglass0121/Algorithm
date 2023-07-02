import java.util.Collection;
import java.util.Collections;

public class MergeSort {
    static int  number = 8;
    static int[] sorted= new int[8]; //정렬된 결과  배열 - 정렬 배열은 반드시 전역변수로 선언


    static void merge(int a[], int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m; //sorted 배열의 인덱스

        //작은 순서대로 배열에 삽입
        while (i <= middle && j <= n) {
            if (a[i] <= a[j]) {
                sorted[k] = a[i];
                i++;
            } else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        //남은 데이터 삽입
        if (i > middle) { // i가 다 sorted에 넣어주었다면
            for (int l = j; l <= n; l++) {//남은 j를 sorted에 넣어준다.
                sorted[k] = a[l];
                k++;
            }
        } else {
            for (int l = i; l <=middle; l++) {//남은 i를 sorted에 넣어준다.
                sorted[k] = a[l];
                k++;
            }
        }
        //정렬된 배열을 삽입
        for (int l = m; l <= n; l++) {
            a[l] = sorted[l];
        }


    }

    static void mergeSort(int a[], int m, int n) {
        if (m < n) { //원소가 1개가 될때까지 분활
            int middle = (m + n) / 2;
            mergeSort(a,m,middle);
            mergeSort(a, middle + 1, n);
            merge(a, m,middle, n);
            System.out.println("middle = " + middle);

        }
    }
    public static void main(String[] args) {
        int[] array  = {6,3,4,2,31,6,2,3};
        mergeSort(array,0,number-1);


        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }





    }
}
