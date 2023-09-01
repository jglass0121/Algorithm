import java.util.*;

public class 모험가길드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int result = 0; //총 그룹 수
        int count = 0; //현재 그룹에 포함된 모험가의 수

        for (int i = 0; i < num; i++) {
            count += 1;
            if (count >= list.get(i)) {
                result += 1;
                count = 0;
            }
        }


        System.out.println("result = " + result);

    }
}
