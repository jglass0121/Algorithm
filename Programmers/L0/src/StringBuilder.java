public class StringBuilder {
    public static void main(String[] args) {

        String s = "Hello World";
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'o') {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }
}
