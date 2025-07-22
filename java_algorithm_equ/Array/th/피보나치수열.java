package th;

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int n : solution(num)){
            System.out.print(n+" ");
        }
    }

    private static int[] solution(int num) {
        int[] answer = new int[num];
        answer[0]= 1;
        answer[1]= 1;
        for (int i = 2; i < num; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer
                ;
    }
}
