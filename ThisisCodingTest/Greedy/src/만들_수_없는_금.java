import java.util.*;

public class 만들_수_없는_금 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nun = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nun; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr); // 1 1 2 3 9


        int target = 1;
        for (int i = 0; i < nun; i++) {
            if (target < arr.get(i)) {
                break;
            }
             target += arr.get(i);
        }
        System.out.println("target = " + target);

    }
}
