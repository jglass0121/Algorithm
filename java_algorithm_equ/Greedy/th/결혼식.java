package th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int time;
    public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    //e가 먼저나와야함
    @Override
    public int compareTo(Time o) {
        if(this.time == o.time) return this.state - o.state;
        return this.time - o.time;
    }
}

public class 결혼식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Time(sT, 's'));
            arr.add(new Time(eT, 'e'));
        }
        System.out.println(solution(arr));


    }

    private static int solution(ArrayList<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0; // 이순간에 몇명
        for (Time ob : arr) {
            if (ob.state == 's') {
                cnt++;
            }else{ //e
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return  answer;


    }
}
