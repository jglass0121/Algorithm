package L2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Solution {
    static class Course implements Comparable<Course> {
        int index; // 노드
        int effort; // 가중치

        public Course(int longVal, int mountain) {
            this.index = longVal;
            this.effort = mountain;
        }

        @Override
        public int compareTo(Course o) {
            return this.effort - o.effort;
        }
    }

    static LinkedList<LinkedList<Course>> list = new LinkedList<>();

    static int[] efforts;
    static int[] summits;
    public int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        summits =  summits;
        for (int i = 0; i < n + 1; i++) {
            list.add(new LinkedList());
        }

        for (int[] path : paths) {
            list.get(path[0]).add(new Course(path[1], path[2]));
            list.get(path[1]).add(new Course(path[0], path[2]));
        }

        efforts = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            efforts[i] = Integer.MAX_VALUE;

        }

        for (int gate : gates) {
            dijstra(gate);
        }


        Arrays.sort(summits);
        int idx = -1;
        int minEffort = Integer.MAX_VALUE;
        for (int summit : summits) {
            if (efforts[summit] < minEffort) {
                minEffort = efforts[summit];
                idx = summit;
            }
        }

        return new int[]{idx, minEffort};
    }
    private static void dijstra(int gate) {
        PriorityQueue<Course> pq = new PriorityQueue<>();
        pq.add(new Course(gate, 0));
        while (pq.size() != 0) {
            Course now = pq.poll();
            if (check(now.index)) {
                continue;
            }
            if (efforts[now.index] < now.effort) {
                continue;
            }
            for (Course next : list.get(now.index)) {
                int effort = (next.effort == Integer.MAX_VALUE) ? now.effort : Math.max(now.effort, next.effort);
                if (efforts[next.index] > effort) {
                    efforts[next.index] = effort;
                    pq.offer(new Course(next.index, efforts[next.index]));
                }
            }
        }

    }

    private static boolean check(int nextCourse) {
        for (int j = 0; j < summits.length; j++) {
            int summit = summits[j];
            if (nextCourse == summit) {
                return true;
            }
        }
        return false;
    }
}