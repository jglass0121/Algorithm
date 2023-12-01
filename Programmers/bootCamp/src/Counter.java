public class Counter {
    private int[] digits; // 각 자리수의 값 저장
    private int[] maxValues; // 각 자리수의 최대 값

    // 생성자
    public Counter(int[] maxValues) {
        this.digits = new int[maxValues.length];
        this.maxValues = maxValues;
    }

    // 계수기 클릭 메서드
    public void click() {
        int carry = 1; // 자리 올림 값
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            System.out.println("digits[i] = " + digits[i]);

            if (digits[i] > maxValues[i]) {
                digits[i] = 0; // 자리수를 초과하면 0으로 초기화
                carry = 1; // 자리 올림 발생
            } else {
                carry = 0; // 자리 올림 없음
                break;
            }
        }
    }

    // 계수기 번호 출력 메서드
    public String getCounterNumber() {
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            System.out.println("digit = " + digit);
            result.append(digit);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] maxValues = {7, 8}; // 각 자리수의 최대 값
        Counter counter = new Counter(maxValues);

        // 초기 번호 설정
        counter.digits[0] = 2;
        counter.digits[1] = 2;

        // 15번 클릭
        for (int i = 0; i < 200; i++) {
            counter.click();


        }

        // 계수기 번호 출력
        String counterNumber = counter.getCounterNumber();
        System.out.println("계수기 번호: " + counterNumber);
    }
}
