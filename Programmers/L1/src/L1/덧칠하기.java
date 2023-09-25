package L1;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        solution(n, m, section);
    }

    private static int solution(int n, int m, int[] section) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < section.length; i++) {
            if(section[i]<temp) continue;
            answer++;
            temp = section[i] + m;
        }
        return answer;
    }



}
