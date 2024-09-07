public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 4, 2, 3, 1, 2, 8};
        printArray(arr);
        quickSort(arr);
        printArray(arr);

    }

    private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);

    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if(start < part2 -1) quickSort(arr, start, part2 - 1);
        if(part2 < end) quickSort(arr, part2, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] <pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
                start++;
                end--;
            }
        }
        return start

                ;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
