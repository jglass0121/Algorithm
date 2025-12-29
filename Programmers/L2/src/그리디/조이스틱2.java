package 그리디;

public class 조이스틱2 {
    public static void main(String[] args) {
        String name = "JEROEN";
        solution(name);
    }

    private static void solution(String name) {
        String[] arr = name.split("");
        int oneVal = 0;

        // 위 아래 / 정방향 계산
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            // 위아래중 최소
            char c = arr[i].charAt(0);
            int one = c - 'A';
            int two ='Z'- c+1 ;
            oneVal += Math.min(one, two);
            right++;

        }

        // 정방향  - len-1
        // 양 옆이동


    }
}
