import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2164_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }


        int cnt=0;
        while (queue.size() != 1) {
            Integer poll = queue.poll();
            if(cnt%2!=0){
                queue.add(poll);
            }
            cnt++;
        }

        System.out.println(queue.poll());
    }
}
