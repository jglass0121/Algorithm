package me.ex2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Visit implements Comparable<Visit>{
    int time;
    char w;

    public Visit(int time, char w) {
        this.time = time;
        this.w = w;
    }


    @Override
    public int compareTo(Visit o) {
        if(this.time == o.time){
            return this.w - o.w;
        }
        return this.time - o.time;
    }
}
public class 결혼식 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[num][2];
        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        solution(arr, num);
    }

    public static void solution(int[][] arr, int num) {
        LinkedList<Visit> visits = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            visits.add(new Visit(start,'s'));
            visits.add(new Visit(end,'e'));
        }

        Collections.sort(visits);

        int cnt = 0;
        int max = -1;
        for (Visit visit : visits) {
            char com = visit.w;
            if (com == 'e') {
                cnt--;
            } else {
                cnt++;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}
