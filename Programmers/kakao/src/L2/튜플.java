package L2;

import java.util.Arrays;
import java.util.LinkedList;

public class 튜플 {
    public static void main(String[] args) {
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        LinkedList<Integer> solution = solution(s);
        System.out.println("solution = " + solution);
    }

    private static LinkedList<Integer> solution(String s) {

        // string -> int[]로 변경
        boolean isLock = false;
        String str = "";
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 1; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '{') {
                isLock = true;
                continue;
            }

            if (c == '}') {
                if (isLock) {
                    str = str.trim();
                    String[] split = str.split(",");
                    int[] arr = new int[split.length];
                    for (int j = 0; j < split.length; j++) {
                        arr[j] = Integer.parseInt(split[j]);
                    }

                    list.add(arr);
                }
                str = "";
                isLock = false;
                continue;

            }

            if (isLock) {
                str += "" + c;

            }

        }
        list.sort((a, b) -> Integer.compare(a.length, b.length));

        LinkedList<Integer> res= new LinkedList<>();
        for (int[] arr : list) {

            for (int i = 0; i < arr.length; i++) {
                int front = arr[i];
                if (!res.contains(arr[i])) {
                    res.add(front);
                }
            }
        }

        return res;
    }


}
