package Book;

public class 재귀_합 {
    public static int[] d = new int[100];
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println("factorial = " + factorial);
    }

    private static int factorial(int i) {
        if (i <= 1) {
            return 1;
        }

        if (d[i] != 0) {
            return d[i];
        }
        d[i] = i + factorial(i - 1);
        //d[i] =  i + factorial(i - 2);
        return d[i];
    }

}
