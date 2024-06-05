public class Main {
    public static void main(String[] args) {
        // 1부터 10000까지의 수를 저장할 배열
        boolean[] isSelfNumber = new boolean[10001];
        
        // 배열을 true로 초기화 (모두 셀프 넘버라고 가정)
        for (int i = 1; i <= 10000; i++) {
            isSelfNumber[i] = true;
        }

        // 생성자가 있는 숫자를 false로 변경
        for (int i = 1; i <= 10000; i++) {
            int dn = getDn(i);
            if (dn <= 10000) {
                isSelfNumber[dn] = false;
            }
        }

        // 셀프 넘버 출력
        for (int i = 1; i <= 10000; i++) {
            if (isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    // dn을 구하는 메소드
    public static int getDn(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10; // 각 자리수 더하기
            number /= 10;
        }
        return sum;
    }
}
