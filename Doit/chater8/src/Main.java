public class Main {
    public static void main(String[] args) {

        System.out.print("텍스트 : ");
        String s1 = "ABC이지스DEF";
        System.out.print("패턴 : ");
        String s2 = "이지스";

        int a = s1.indexOf(s2);
        System.out.println("a = " + a);



    }
}