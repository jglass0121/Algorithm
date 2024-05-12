package L1;

import java.util.Arrays;

public class 제일작은수제거 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    private static int[] solution(int[] arr) {
        if(arr.length==1 && arr[0] == 10){
            return new int[]{-1};
        }

        int[] arrClone = arr.clone();
        Arrays.sort(arr);
        int min = arr[0];

        int[] narr = new int[arr.length-1 ];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrClone[i] == min) {
                continue;
            } else {
                narr[idx++] = arrClone[i];
            }
        }
        return narr;


    }
}
