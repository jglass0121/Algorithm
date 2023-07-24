import java.util.*;

public class 모험가길드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            list.add( sc.nextInt());
        }

        Collections.sort(list);

        System.out.println("list = " + list);


        int group =0;
        while (!list.isEmpty()) {
            Integer a = ((LinkedList<Integer>) list).pollLast();
            for (int i = 0; i < a-1; i++) {
                Integer pop = ((LinkedList<Integer>) list).pop();
            }
            group++;
        }
        System.out.println("group = " + group);



    }
}

