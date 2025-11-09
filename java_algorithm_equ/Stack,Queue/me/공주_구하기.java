package me;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        solution(N, K);
    }

    private static void solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int cnt = 0;
        while (queue.size() != 1) {
            cnt++;
            if (cnt == k) {
                Integer poll = queue.poll();
                cnt = 0;
            } else{
                Integer poll = queue.poll();
                queue.add(poll);
            }

        }
        System.out.println(queue.poll());

    }
}
