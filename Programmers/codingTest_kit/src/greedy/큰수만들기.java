package greedy;

public class 큰수만들기 {
    public static void main(String[] args) {
        String number = "1924";
        solution(number,2);
    }

    private static String solution(String number, int k) {
        //int maxvalue
        //
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {
            max = 0;
            for(int j = index; j<= k+i; j++) {
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    System.out.println("max = " + max);
                    index = j+1;
                }
            }
            System.out.println("max a = " + max);
            sb.append(max);
            System.out.println("sb = " + sb);
        }
        return sb.toString();

    }
}
