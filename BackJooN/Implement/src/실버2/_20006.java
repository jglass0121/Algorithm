package 실버2;

import java.util.LinkedList;
import java.util.Scanner;

public class _20006 {
    static LinkedList<String[]> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int splitLine = sc.nextInt();
        sc.nextLine();
        list = new LinkedList<>();

        for (int i = 0; i < total; i++) {
            String level = sc.nextLine();
            String nickName = sc.nextLine();
            list.add(new String[]{level, nickName});
        }

        LinkedList<String[]> remain = new LinkedList<>();


        solution(splitLine,remain);

    }

    private static void solution(int splitLine, LinkedList<String[]> remain) {
        String[] first ;
        first= list.pop();
        int flevel = Integer.parseInt(first[0]);
        String fnickName = first[1];
        for (int i = 1; i < splitLine; i++) { //4
            String[] next= list.pop();
            int level = Integer.parseInt(next[0]);
            String nickName = next[1];
            if (!(flevel - 10 <= level || level <= flevel + 10)) {
                remain.add(new String[]{""+level, nickName});
            }

        }







    }
}
