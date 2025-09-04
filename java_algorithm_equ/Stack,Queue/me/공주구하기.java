package me;

import java.util.LinkedList;
import java.util.Scanner;

public class 공주구하기
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        solution(n, k);
    }

    private static int solution(int n, int k) {
        // list 넣기
        // cnt++ 나머지
        //while( list.isSize != 1)
        //if( cnt == k ) 해당 인덱스 제거 제거
        //

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int answer = 0;
        while (!list.isEmpty()) {
            for (int i = 1; i < k; i++) {
                list.add(list.poll());
            }
            list.poll();
            if(list.size() == 1) answer = list.poll();
        }

        return answer;

    }
}
