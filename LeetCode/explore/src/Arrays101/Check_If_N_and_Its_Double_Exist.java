package Arrays101;

public class Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        solution(arr);
    }

    private static boolean solution(int[] arr) {

        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i == j) {
                    continue;
                }

                if (arr[i] == arr[j] * 2) {
                    return isExist=true;
                }


            }
        }

        return isExist;
    }
}
