import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class _2331 {

    static LinkedList list = new LinkedList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reply = sc.nextInt();
        sc.nextLine();

        list.add(num);
        dfs(num, reply);


    }

    private static int dfs(int num, int reply) {
        String s = "" + num;
        String[] split = s.split("");
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            int multi = 1;
            int iarr = Integer.parseInt(split[i]);
            for (int j = 0; j < reply; j++) {
                multi *= iarr;
            }
            sum += multi;
        }
        if (list.contains(sum)) { //반복수열일 경우
            int find = list.indexOf(sum);
            System.out.println(find);
            return sum;
        }

        list.add(sum);
        dfs(sum, reply);

        return 0;
    }
}
