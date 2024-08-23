package _4장;

public class 이진_변환 {
    public static void main(String[] args) {
        String s = "110010101001";
        solution(s);
    }

    private static int[] solution(String s) {

        int[] answer = new int[2];
        while (s.length() > 1) {
            int cntOne = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }
            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }
        return answer;
    }

}
