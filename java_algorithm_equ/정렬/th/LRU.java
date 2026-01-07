package th;

import java.util.Arrays;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] solution = solution(S, N, arr);
        for (int x : solution) {
            System.out.print(x + " ");
        }

    }

    private static int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;

            if (pos == -1) { //miss
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else { // hit
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;

        }

        return cache;
    }
}

