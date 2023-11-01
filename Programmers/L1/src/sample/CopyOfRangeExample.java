package sample;

import java.util.Arrays;

public class CopyOfRangeExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int fromIndex = 2; // 시작 인덱스
        int toIndex = 5;   // 끝 인덱스 (제외)

        int[] copiedArray = Arrays.copyOfRange(originalArray, fromIndex, toIndex);

        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}

