public class isUpperCase {
    public static void main(String[] args) {
        String str = "Hello World!";
        int low = 0, big = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                low++;
            } else {
                big++;
            }
        }
        System.out.println("low = " + low);
        System.out.println("big = " + big);
    }
}
