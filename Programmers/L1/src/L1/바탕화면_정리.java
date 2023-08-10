package L1;

import java.util.Arrays;

public class 바탕화면_정리 {
    public static void main(String[] args) {

        String[] wallpaper = {".#...", "..#..", "...#."};

        int[] solution = solution(wallpaper);
        System.out.println(Arrays.toString(solution));

    }

    private static int[] solution(String[] wallpaper) {
        int minRow, minCol;
        int maxRow, maxCol;

        minRow = minCol =Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }

            }
        }

        //max 값에 + 1을 하는 이유는 드래그를 하려면 끝점을 선택해야 함
        return new int[]{minRow,minCol,maxRow+1,maxCol+1};

    }
}
