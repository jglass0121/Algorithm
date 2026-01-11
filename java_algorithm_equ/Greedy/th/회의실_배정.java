package th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//먼저 끝나는 것부터
class Times implements Comparable<Times> {
    public int s, e;

    public Times(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Times o) {
        if(this.e==o.e) return this.s - o.s; // 오름차순
        return this.e - o.e;
    }
}
public class 회의실_배정 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Times> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Times(x, y));
        }

        System.out.println(solution(arr, n));
    }

    private static int solution(ArrayList<Times> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Times ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

}
