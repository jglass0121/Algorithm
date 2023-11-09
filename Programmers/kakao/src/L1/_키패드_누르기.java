package L1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _키패드_누르기 {

    public static void main(String[] args) {
        int[] numbers = {1, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
        ;
    }

    private static String solution(int[] number, String hand) {
        HashMap map = new HashMap<String, int[]>();
        map.put("1", new int[]{0, 0});
        map.put("2", new int[]{0, 1});
        map.put("3", new int[]{0, 2});
        map.put("4", new int[]{1, 0});
        map.put("5", new int[]{1, 1});
        map.put("6", new int[]{1, 2});
        map.put("7", new int[]{2, 0});
        map.put("8", new int[]{2, 1});
        map.put("9", new int[]{2, 2});
        map.put("0", new int[]{3, 1});
        map.put("11", new int[]{3, 0});
        map.put("12", new int[]{3, 2});


        List<Integer> left = List.of(1, 4, 7);
        List<Integer> right = List.of(3, 6, 9);
        List<Integer> center = List.of(2, 5, 8, 0);
        String result = "";
        int rHand = 12;
        int lHand = 11;
        for (int i = 0; i < number.length; i++) {
            int val = number[i];
            if (i== 0 && center.contains(val)) {
                if (hand.equals("right")) {
                    result += "R";
                    rHand = val;
                } else {
                    result += "L";
                    lHand = val;
                }
            }


            if (right.contains(val)) {
                rHand = val;
                result += "R";
            } else if (left.contains(val)) {
                lHand = val;
                result += "L";
            } else {
                // 거리
                int[] r_place = (int[]) map.get("" + rHand);
                int[] l_place = (int[]) map.get("" + lHand);
                int[] valplace = (int[]) map.get("" + val);
                int x_r = r_place[0];
                int y_r = r_place[1];
                int x_l = l_place[0];
                int y_l = l_place[1];
                int x_val = valplace[0];
                int y_val = valplace[1];

                int rX = Math.abs(x_r - x_val);
                int rY = Math.abs(y_r - y_val);

                int lX = Math.abs(x_l - x_val);
                int lY = Math.abs(y_l - y_val);
                int totalR = rX + rY;
                int totalL = lX + lY;
                if (totalR > totalL) {
                    result += "L";
                    lHand = val;
                } else if (totalR < totalL) {
                    result += "R";
                    rHand = val;
                } else {
                    if (hand.equals("right")) {
                        result += "R";
                        rHand = val;
                    } else {
                        result += "L";
                        lHand = val;
                    }
                }
            }
        }

        return result;

    }
}
