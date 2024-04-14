package sort;

import java.util.Arrays;
import java.util.Comparator;

public class _가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        solution(numbers);

    }

    private static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    String case1 = s1 + s2;
                    System.out.println("case1 = " + case1);
                    String case2 = s2 + s1;
                    System.out.println("case2 = " + case2);
                    System.out.println("----------------");
                    return case2.compareTo(case1);
                }
        });

        if (arr[0].equals("0")) {
            return "0";
        }

        System.out.println("==============");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
            sb.append(arr[i]);
        }
        return sb.toString();

    }
}
