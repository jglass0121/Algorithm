package sort;

/**
 * 처리되지 않은 데이터를 하나씩 골라 적절한 위치 삽입
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int min, temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            min = i; // 가장 작은 값
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
