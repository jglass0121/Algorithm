package L1;

public class 최소직사각형 {
    public static void main(String[] args) {
        //세로 또는 가로를 눕혀서
        //세로길이가 가로보다 자고 가로 길이가 세롤보가작고
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(sizes);

    }

    private static void solution(int[][] sizes) {
        int max_v = 0;
        int max_h = 0;

        for (int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            max_v = Math.max(max_v, v);
            max_h = Math.max(max_h, h);

            }
        }
}
