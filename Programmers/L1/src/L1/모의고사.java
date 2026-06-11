package L1;

import java.util.LinkedList;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        solution(answers);
    }

    private static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] arr = new int[3];
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            int i1 = one[i % one.length];
            int i2 = two [i % two.length];
            int i3 = three[i % three.length];

            if (answer == i1) {
                arr[0]++;
            }
            if (answer == i2) {
                arr[1]++;
            }
            if (answer == i3) {
                arr[2]++;
            }
        }


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i],max );
        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                list.add(i+1);
            }
        }

        int[] ints = list.stream().mapToInt(i -> i.intValue()).toArray();

        return ints;
    }
}
