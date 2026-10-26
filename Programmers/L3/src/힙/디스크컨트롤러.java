package 힙;

import java.util.PriorityQueue;

public class 디스크컨트롤러 {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {3, 5}};

        solution(jobs);
    }

    static class job{

        int idx;
        int startTime;
        int workTime;


        public job(int idx, int startTime, int workTime) {
            this.idx = idx;
            this.startTime = startTime;
            this.workTime = workTime;
        }
    }
    private static void solution(int[][] jobs) {
        PriorityQueue<job> pq = new PriorityQueue<>( // 작업 시간, 작업의 요청시각, 번호
                (a,b) ->{
                    if (a.workTime == b.workTime) {
                        if (a.startTime == b.startTime) {
                            return a.idx - b.idx;
                        }
                        return a.startTime - b.startTime;
                    }
                    return a.workTime - b.workTime;
                }
        );

        int idx = 0;
        for (int[] job : jobs) {
            int call = job[0];
            int workTIme = job[1];
            idx += 1;
            pq.add(new job(idx, call, workTIme));
        }


        int now = 0;
        int returnTime = 0;
        for (job job : pq) {
            int wordIdx = job.idx;
            int workTime = job.workTime;
            int startTime = job.startTime;

            int totalTime = startTime + workTime;

            if (totalTime < startTime) {
                now = startTime;
            } else {
                now = totalTime;
            }




        }




    }
}
