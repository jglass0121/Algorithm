package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 기능개발2 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        solution(progresses, speeds);
    }

    private static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int day = (100 - progress) / speed;
            if (((100 - progress) % speed) != 0) {
                day++;
            }

            queue.add(day);
        }


        LinkedList<Integer> list = new LinkedList<>();

        while (!queue.isEmpty()) {
            int deployDay = queue.poll(); // 현재 배포 기준일
            int count = 1;

            // 다음 작업들이 현재 기준일 이내에 끝났다면 함께 배포
            while (!queue.isEmpty() && queue.peek() <= deployDay) {
                queue.poll();
                count++;
            }

            list.add(count);
        }


        return list.stream().mapToInt(Integer::intValue).toArray();



    }
}
