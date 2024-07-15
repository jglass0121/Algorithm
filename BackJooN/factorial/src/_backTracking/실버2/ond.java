package _backTracking.실버2;


class classtwo extends classOne {

    public classtwo (int i ) {
        super(i, i + 1);
    }

    public void print() {
        System.out.println("classtwo");
    }
}
class classOne{
    int a, b;

    public classOne(int a, int b ) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("classOne");
    }
}

public class ond {



    public static void main(String[] args) {
        classOne one = new classtwo(10);
        one.print();

    }
}
