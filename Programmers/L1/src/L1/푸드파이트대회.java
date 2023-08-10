package L1;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        System.out.println(solution(food));
        ;
    }

    private static String solution(int[] food) {
        //0은 물
        //1부터
        //만약 1일경우 건너띰
        // 몫을 구함

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] == 1) {
                continue;
            }
            int a = food[i] / 2;
            for (int j = 0; j < a; j++) {
                sb.append(i);
                str += i;
            }
        }
        sb.reverse();
        sb2.append(str).append(0).append(sb);
        return sb2.toString();
    }

}
