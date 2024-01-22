package Arrays101;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int n = 3;
        int[] nums2 = {2, 5, 6};
        solution(nums1, m, nums2, n);

    }

    private static void solution(int[] nums1, int m, int[] nums2, int n) {
        int idx = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[idx];
            idx++;
        }
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
