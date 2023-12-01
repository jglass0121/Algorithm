package 스택_큐;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {90, 90};
        int[] speeds = {10, 9};
        solution(progresses, speeds);
        HashMap<String, Integer> map = new HashMap<>();
    }


    private static void solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int finday = remain / speeds[i];
            if (remain % speeds[i] >= 1) {
                finday += 1;
            }
            q.add(finday);
        }


        int first = q.poll();
        LinkedList<Integer> res = new LinkedList<>();
        int cnt = 1;
        if (q.size() >= 1) {
            while (q.size() != 0) {
                Integer nextCnt = q.poll();
                if (first >= nextCnt) { // 7 1
                    cnt += 1;
                    continue;
                }
                res.add(cnt);
                cnt = 1;
                first = nextCnt;
            }
            res.add(cnt);
        }
        System.out.println(res);

    }

}
