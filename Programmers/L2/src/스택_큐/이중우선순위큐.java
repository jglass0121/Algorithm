package 스택_큐;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        solution(operations);

    }

    private static int[] solution(String[] operations) {
        TreeSet<Integer> list = new TreeSet<Integer>();

        for (String operation : operations) {
            System.out.println("operation = " + operation);

            String[] split = operation.split(" ");
            String s = split[0];
            int i = Integer.parseInt(split[1]);
            if (s.equals("I")) {
                list.add(i);
            }

            if (s.equals("D")) {
                if (list.isEmpty()) {
                    continue;
                }
                if (i < 0) { // 최솟값 삭제
                    list.pollFirst();
                } else { // 최댓값 삭제
                    list.pollLast();
                }
            }
        }


        if (list.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{list.last(), list.first()};
    }
}
