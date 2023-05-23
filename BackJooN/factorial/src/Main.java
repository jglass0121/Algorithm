public class Main {
    public static void main(String[] args) {
    func(5);
    }

    private static void func(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("i before= " + i);
        func(i - 1);
        System.out.println("i after = " + i);
    }
}