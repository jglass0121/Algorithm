public class Main {
    public static void main(String[] args) {
        int count = 0;
        int left = 0;
        int[] arr = new int[3];
        int right = arr.length - 1;
        int x = 15;
        toPoint(left, right, arr, x);


    }

    private static int[] toPoint(int left, int right, int[] arr, int x) {
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                return new int[]{left, right};
            } else if (sum < x) {
                left++;
            } else if (sum > x) {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}