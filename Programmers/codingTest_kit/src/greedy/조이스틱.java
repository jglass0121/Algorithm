package greedy;

public class 조이스틱 {
    public static void main(String[] args) {
        System.out.println(solution("JEROEN")); // 56
        System.out.println(solution("JAN"));    // 23

    }

    private static boolean solution(String name) {
        int answer = 0;
        int length = name.length();

        //위 아래 - 최소값 구하기
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }
        // 좌우 - 최소값
        int minMove = length - 1;
        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            minMove = Math.min(minMove, i + length - next + Math.min(i, length - next));
        }


        return false;
    }
}
