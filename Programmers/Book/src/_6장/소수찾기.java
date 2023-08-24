package _6장;

public class 소수찾기 {
    static int result = 0;
    public static void main(String[] args) {
        String number = "17";
        solution(number);
    }

    private static void solution(String number) {
        int length = number.length(); // 2
        dfs(number, 0, length);
        System.out.println("result = " + result);

    }

    private static void dfs(String number, int idx, int length) {
        System.out.println("number = " + number);

        if (length == idx) {
            return;
        }

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            String s = c + "";
            System.out.println("s = " + s);
            //dfs(s, i + 1, length);
        }


    }

}
