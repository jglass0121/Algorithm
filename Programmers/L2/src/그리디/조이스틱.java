package 그리디;

public class 조이스틱 {
    public static void main(String[] args) {
        String name = "JEROEN";
        solution(name);
    }

    private static void solution(String name) {

        int answer = 0;
        int length = name.length();

        // 좌우 이동 기본값: 오른쪽으로 끝까지 쭉 가는 경우
        int res = 0;
        for (int i = 0; i < name.length(); i++) {
            char alpha = name.charAt(i);
            if(alpha == 'A') continue;
            // 위 아래
            int up = 'A' - alpha;
            int down = alpha - 'B';
            answer += Math.min(up, down);

            if(alpha == 'A'){
                continue;
            }
            res++;
        }



    }
}
