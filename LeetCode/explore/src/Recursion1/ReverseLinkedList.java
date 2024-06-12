package Recursion1;

import java.util.Arrays;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4, 5};
        solution(head);
        System.out.println("Arrays.toString(s) = " + Arrays.toString(head));

    }

    private static void solution(int[] head) {
        fac(head, 0, head.length - 1);
    }

    private static void fac(int[] head, int start, int end) {
        if(start>=end) return;
        if(head.length==0) return;

        //swap
        int temp = head[start];
        head[start] = head[end];
        head[end] = temp;

        fac(head, start + 1, end - 1);
    }
}
