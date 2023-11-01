package 우테코;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class _2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        String[] nameSplit = names.split(",");
        for (int i = 0; i < nameSplit.length; i++) {
            if (nameSplit[i].length() > 5) {
                throw new IllegalArgumentException("5자 이하만 가능합니다.");
            }
        }

        int[] carPositions = new int[nameSplit.length];
        //시도

        String numAttempt = sc.nextLine();
        sc.close();
        if (!numAttempt.matches("[0-9]+")) {
            throw new IllegalStateException("숫자로 입력해주세요");
        }

        int numAttempts = Integer.parseInt(numAttempt);
        //최종
        int maxScore = 0;
        for (int position :carPositions ) {
           maxScore= Math.max(maxScore, position);
        }
        System.out.println("maxScore = " + maxScore);

        LinkedList<String> winner = new LinkedList<>();
        for (int i = 0; i < nameSplit.length; i++) {
            if (carPositions[i] == maxScore) {
                winner.add( nameSplit[i]);
                System.out.println(winner);
            }
        }

        System.out.println("최종 우승자 : " + String.join(",", winner));

    }


}
