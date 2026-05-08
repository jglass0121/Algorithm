package _12장;

public class 큰수구하기 {
    public static void main(String[] args) {
        String numbers= "1924";
        int k=2;
        solution(numbers,k);
    }

    private static String solution(String numbers, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : numbers.toCharArray()){
            while (k > 0 &&sb.length() >0 && sb.charAt(sb.length()-1)<c){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(c);
        }
        return sb.substring(0,sb.length()-k);
    }
}
