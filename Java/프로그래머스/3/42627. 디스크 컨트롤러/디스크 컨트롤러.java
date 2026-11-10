import java.util.*;
class Solution {
    
        static class Disk{
        int idx;
        int start;
        int time;

        public Disk(int idx, int start, int time) {
            this.idx = idx;
            this.start = start;
            this.time = time;
        }

    }
    
    public int solution(int[][] jobs) {
        // [수정 1] 먼저 요청 시간(start)이 빠른 순으로 배열을 정렬해야 합니다.
        Arrays.sort(jobs, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        PriorityQueue<Disk> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.time == o2.time) {
                if (o1.start == o2.start) {
                    return Integer.compare(o1.idx, o2.idx); // idx 오름차순
                }
                return Integer.compare(o1.start, o2.start); // start 오름차순
            }
            return Integer.compare(o1.time, o2.time); // time 오름차순
        });

        // 처음에 for문으로 모든 작업을 pq에 넣는 부분을 삭제합니다.

        int currentTime = 0; // 기존 startTime 역할을 할 '현재 시간'
        int jobIdx = 0;      // 배열에서 몇 번째 작업까지 큐에 넣었는지 추적
        LinkedList<Integer> list = new LinkedList<>();

        // [수정 2] 큐가 비어있지 않거나, 아직 큐에 넣을 작업이 남아있을 때까지 반복
        while (jobIdx < jobs.length || !pq.isEmpty()) {

            // 현재 시간(currentTime) 이하에 이미 도착한 작업들만 큐에 넣습니다.
            while (jobIdx < jobs.length && jobs[jobIdx][0] <= currentTime) {
                pq.add(new Disk(jobIdx, jobs[jobIdx][0], jobs[jobIdx][1]));
                jobIdx++;
            }

            if (pq.isEmpty()) {
                // 큐에 아무것도 없다면 디스크가 놀고 있다는 뜻이므로, 다음 작업이 올 시간으로 워프합니다.
                currentTime = jobs[jobIdx][0];
            } else {
                // 이미 도착한 작업 중 가장 짧은 작업을 꺼내서 처리합니다.
                Disk now = pq.poll();

                // [수정 3] 계산식 변경: (현재 시간 - 요청 시간) + 소요 시간
                int re = (currentTime - now.start) + now.time;
                list.add(re);

                // 다음 현재 시간은 기존 '현재 시간 + 작업 소요 시간'으로 누적되어야 합니다.
                currentTime += now.time;
            }
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        int avg = sum / list.size();
        System.out.println("avg = " + avg);
        return avg;
    }
}