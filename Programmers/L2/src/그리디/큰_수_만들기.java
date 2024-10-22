package 그리디;

public class 큰_수_만들기 {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        String solution = solution(number, k);
        System.out.println("solution = " + solution);
    } public static String solution(String number, int k) {
        StringBuilder builder = new StringBuilder();

        int idx = 0;
        int max;
        for(int i = 0; i < number.length()-k; i++){
            max = 0;
            for(int j = idx; j <= i+k; j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            System.out.println("----");
            builder.append(max);
        }
        return builder.toString();
    }


}
