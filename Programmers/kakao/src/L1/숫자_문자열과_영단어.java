package L1;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        int i = Integer.parseInt(s);
        System.out.println("i = " + i);
    }


}
