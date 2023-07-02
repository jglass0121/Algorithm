package _4장;


import java.util.ArrayList;

public class _3진법_뒤집기 {
    public static void main(String[] args) {
        //3으로 나누었을 때 몫이 3으로 나누어 지지 못하면 나머지를 거꾸로 읽는다
        //나누었을때의 몫과 나머지(1자리수)만 저장
        int n = 45;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // 10진법 -> 3진법
        while(n != 0) {
            list.add(n%3);
            n /= 3;
        }
        // 3진법 -> 10진법
        int tmp = 1;
        for(int i=list.size()-1;i>=0;i--) {
            answer += list.get(i)*tmp;
            tmp *= 3;
            System.out.println("tmp = " + tmp);
        }
        return answer;
    }


}



