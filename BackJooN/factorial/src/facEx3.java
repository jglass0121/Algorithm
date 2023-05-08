public class facEx3 {
    public static void main(String[] args) {
            System.out.println(fac(5));
    }

    private static int fac(int i) {
        if (i <= 1) {
            return i;
        }
        return fac(i - 2) + fac(i - 1);


    }
}
