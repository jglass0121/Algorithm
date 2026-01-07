package me;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        //deque
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] solution = solution(S, N, arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < solution.length; i++) {
            sb.append(solution[i]).append(" ");
        }
        System.out.println(sb.toString());



    }

    private static int[] solution(int size, int n, int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            // 1️⃣ 이미 있으면 제거
            if (list.contains(val)) {
                list.remove((Integer) val);
            }

            // 2️⃣ 맨 앞에 추가
            list.addFirst(val);

            // 3️⃣ 용량 초과 시 뒤 제거
            if (list.size() > size) {
                list.removeLast();
            }
        }

        return list.stream().mapToInt(i -> i.intValue()).toArray();

    }
}
