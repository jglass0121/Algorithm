package L1;

public class _부족한_금액_계산 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));
    }

    private static int solution(int price, int money, int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum+= price * i;
        }


        int remain = sum - money;
        int answer = 0;
        if (remain > 0) {
            answer = remain;
        }
        return answer;

    }
}
