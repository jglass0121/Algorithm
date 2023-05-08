import java.util.Arrays;

public class faceEx1 {
    public static void main(String[] args) {
        System.out.printf("%d \n",factorial(5));
    }

    private static int factorial(int i) {
            if (i == 1) {
                return i;
            }
            return i * factorial(i - 1);
    }
}
