package String;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] numse = {3, 6, 1, 0};
        soution(numse);
    }

    private static int soution(int[] numse) {
        //가장 큰 수 찾기
        int max = -1;
        int idx = -1;
        for (int i = 0; i < numse.length; i++) {
            if (max < numse[i]) {
                max = numse[i];
                idx = i;
            }
        }

        //비교
        for (int i = 0; i < numse.length; i++) {
            if(i ==idx ) continue;
            if (numse[i] * 2 > max) {
                return -1;
            }
        }

        return idx ;



    }
}

