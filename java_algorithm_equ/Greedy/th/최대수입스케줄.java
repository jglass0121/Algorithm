package th;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time-this.time;
    }
}

public class 최대수입스케줄 {
    public static int max = 0;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if(d  > max) max = d; // 가장 큰 값 찾기
        }

        System.out.println(solution(arr));
    }

    private static int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int idx =0 ;
        for (int i = max; i >= 1; i--) { // 큰값부터
            for (int j = idx; j < n; j++) {
                if (arr.get(j).time < i) break;
                int money = arr.get(j).money;
                pq.add(money);
                idx++;
            }

            if (!pq.isEmpty()) {
                Integer poll = pq.poll();
                answer+= poll;
            }

        }


        return answer;
    }
}
