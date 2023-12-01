/**
 * 우선순위 큐
 */
public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(
                (o1, o2) -> o2.compareTo(o1));


        // 1, 15, 8, 21, 25, 18, 10 값 추가
        pq.add(1);
        pq.add(15);
        pq.offer(10);
        pq.add(21);
        pq.add(25);
        pq.offer(18);
        pq.add(8);

//        pq.remove(15);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }

}
