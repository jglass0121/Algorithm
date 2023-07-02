public class Main {
    private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end); //start
        if (start < part2 - 1) {// 오른쪽 파티션이 시작점에서 한 개 이상 차이가 날 때만(쏠려있지 않은 경우에만) 함수를 재귀적으로 호출하게 함
            quickSort(arr,start,part2-1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);

        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        System.out.println("pivot = " + pivot);
        while (start <= end) {
            while (arr[start]<pivot) start++;
            while (arr[end]>pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        System.out.println("start = " + start);
        return start;

    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data+", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 4, 2, 3, 1, 2, 8};
        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
}