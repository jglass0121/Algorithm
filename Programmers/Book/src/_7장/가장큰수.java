package _7장;

import java.util.*;

public class 가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);

    }

    private static void solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("o1 = " + o1);
                System.out.println("o2 = " + o2);

                System.out.println(o2+o1);
                System.out.println(o1+o2);

                System.out.println();
                return (o2+o1).compareTo(o1+o2);

            }
        });
    }
}
