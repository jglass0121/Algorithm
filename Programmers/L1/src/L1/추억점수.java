package L1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 추억점수 {
    public static void main(String[] args) {
        String[] names = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning = new int[]{5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}
        };

        int[] solution = Solution(names, yearning, photo);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("solution = " + solution[i]);
        }


    }

    private static int[] Solution(String[] names, int[] yearning, String[][] photo) {


            int[] answer  = new int[photo.length];
            for (int i = 0; i < photo.length; i++) {
                for (int j = 0; j < photo[i].length; j++) {
                    String s = photo[i][j];

                    //배열의 string 과 값 비교 후 요소 출력
                    for (int k = 0; k < names.length; k++) {
                        if (names[k].equals(s)) {
                            answer[i] += yearning[k];
                        }

                    }
                }

            }

            return  answer ;

        }

    }
