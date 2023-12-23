package topoint;

public class ex2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 11, 15 };
        int x = 15;
        int right = 0;
        int left = 0;
        int sum = 0;
        while (right <= arr.length) {

            if (sum == x) {
                System.out.println(right + ", " + left);
                break;
            } else if (sum < x) {
                left++;
                sum += arr[left];

            } else {
                right++;
                sum++;
            }


        }
    }
}
