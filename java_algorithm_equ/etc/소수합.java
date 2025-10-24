//  1~100사이의 소수 합 구하기
public class 소수합 {
    public static void main(String[] args) {
        int sum = 0 ;
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i)){
                sum += i;
            }
        }

        System.out.println(sum);
    }

    private static boolean isPrime(int num) {

        for (int j = 2; j <= (int)Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }

        }t
        return true;
    }
}
