package L1;

public class 햄버거 {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int solution = solution(ingredient);
        System.out.println("solution = " + solution);
    }

    private static int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ingredient.length; i++) {
            sb.append(ingredient[i]); // i번째 재료 저장

            if(sb.length()>3) {
                if(sb.charAt(sb.length()-1) == '1' &&       // 가장 마지막 재료 빵 and
                        sb.charAt(sb.length()-2) == '3' &&       // 그 앞 재료 고기 and
                        sb.charAt(sb.length()-3) == '2' &&       // 그 앞 재료 야채 and
                        sb.charAt(sb.length()-4) == '1') {       // 그 앞 재료 빵이면
                    answer++;

                    sb = new StringBuilder(sb.substring(0, sb.length()-4));
                    // 마지막 4개 재료 삭제 -> 이거해야 스택처럼 됨
                }
            }
        }
        return answer;

    }
}
