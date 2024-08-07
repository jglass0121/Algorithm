import java.util.Arrays;

/**
 * 거슬러 주어야 할 동전의 최소 개수
 *  큰 단위가 항상 작은 단위의 배수이므로
 *  작은 단위의 동전들을 종합하여 다른 해가 나올 수 없음
 */
public class coin {
    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin;
        }


        System.out.println("cnt = " + cnt);
    }
}
