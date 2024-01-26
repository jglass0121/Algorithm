package Arrays101;

public class Valid_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        solution(arr);
    }

    private static boolean solution(int[] arr) {
        if (arr == null ||arr.length < 3) {
            return false;
        }

        boolean isAsc = true;
        for (int i = 1; i < arr.length; i++) {

            if (isAsc) {
                if (arr[i - 1] > arr[i]) {
                    if (i == 1) { //처음부터 하강일 경우 탈락
                        return false;
                    } else {
                        isAsc = false; //하강 전환
                    }
                } else if (arr[i - 1] == arr[i]) { // 같은 경우
                    return false;
                }
            } else { // 하강
                if (arr[i - 1] <= arr[i]) {
                    return false;
                }
                
            }


        }

        return isAsc ? false : true; // 하강이 없이 끝나면 false
    }
}
