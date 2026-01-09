package th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Birck implements Comparable<Birck> {

    public int s, h, w;

    public Birck(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Birck o) {
        return o.s - this.s;
    }
}

public class 가장_높은_탑_쌓기 {
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Birck> arr = new ArrayList<>();

        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Birck(a, b, c));
        }

        System.out.println(solution(arr));


    }

    private static int solution(ArrayList<Birck> arr) {
        int answer = 0;
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];
        for (int i = 1; i < arr.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(j).w && dy[j] > max_h) { // 무게가 더 크로
                    max_h = dy[j];
                }
            }

            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }


        return 0;
    }
}
