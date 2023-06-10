import java.util.Collections;
import java.util.Scanner;

/**
 * 우선순위 큐
 */
public class _2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(Collections.reverseOrder());

        int one = sc.nextInt();
        for (int i = 0; i < one; i++) {
            for (int j = 0; j < one; j++) {
                pq.add(sc.nextInt());
            }
        }


        for (int i = 0; i <one-1 ; i++) {
            pq.poll();
        }
        System.out.println(pq.poll());


    }
}
