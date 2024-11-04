package me;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> solution = solution(n, m, arr, arr2);
        solution.stream().forEach(i-> System.out.print(i+" "));

    }

    private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 <n  && p2 < m) { //  누군가 하나가 false면 멈춤
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1 < n) {
            answer.add(a[p1++]);
        }

        while (p2 < m) {
            answer.add(b[p2++]);
        }


        return answer;


    }

}
