package me;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Times implements Comparable<Times>{
    int time;
    char state;

    public Times(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Times o) {
        if(this.time == o.time) return this.state - o.state; // e을 먼저 처리
        return this.time - o.time; // 오름차순
    }
}
public class 결혼식_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Times> arr = new ArrayList<>();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String[] split = sc.nextLine().split(" ");
            int one = Integer.parseInt(split[0]);
            int two = Integer.parseInt(split[1]);
            arr.add(new Times(one, 's'));
            arr.add(new Times(two, 'e'));
        }


        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Times t : arr) {
            if(t.state == 'e') cnt--;
            else cnt++;
            answer= Math.max(cnt,answer);
        }

        System.out.println(answer);
    }
}
