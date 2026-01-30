package L1;

public class 숫자_문자열과영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        solution(s);
    }

    private static void solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            s  = s.replaceAll(arr[i], ""+i);
        }
        System.out.println(s);

    }
}
