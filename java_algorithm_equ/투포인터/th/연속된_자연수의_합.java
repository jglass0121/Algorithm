package th;

import java.util.Scanner;

public class 연속된_자연수의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));


    }

    private static int solution(int n) {
        int answer = 0, cnt =1 ;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if(n %cnt == 0) answer++;
        }

        return answer;
    }
}
