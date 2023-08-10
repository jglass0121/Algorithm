import java.util.Stack;

public class fac {
    static void recur(int n)
    {
        Stack s = new Stack();

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = (int) s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        recur(4);
    }

}
