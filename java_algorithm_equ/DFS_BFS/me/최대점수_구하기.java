package me;

import java.util.LinkedList;
import java.util.Scanner;

//DFS
class Class{
    int score;
    int time;

    public Class(int score, int time) {
        this.score = score;
        this.time = time;
    }
}
public class 최대점수_구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        LinkedList<Class> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            list.add(new Class(score,time));
        }


        fac(0,0,0,list,M);
        System.out.println(answer);
    }

    static int answer = 0;
    private static void fac(int totalVal, int totalTime,int depth, LinkedList<Class> list, int limitTime) {

        if(totalTime >  limitTime ) {
            return;
        }
        if (depth == list.size()) {
            if(totalTime <= limitTime ){
                answer = Math.max(totalVal,answer);

            }
            return;
        }


        fac(totalVal+list.get(depth).score,totalTime+list.get(depth).time,depth+1,list,limitTime);
        fac(totalVal,totalTime,depth+1,list,limitTime);


    }
}
