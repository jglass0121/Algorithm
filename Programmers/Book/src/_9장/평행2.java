package _9장;

import java.util.ArrayList;

public class 평행2 {
    public static void main(String[] args) {
        int[][] dots = {{1,1},{2,2},{3,3},{50,100}};

        System.out.println(solution(dots));
        ;

    }

    private static int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < dots.length - 1; i++) {
            if (answer == 1) {
                break;
            } else {

            for (int j = i + 1; j < dots.length; j++) {
                double cur = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                if (arr.contains(cur)) {
                    answer = 1;
                    break;
                } else {
                    arr.add(cur);
                }

            }
            }

        }
        return answer;
    }

}
