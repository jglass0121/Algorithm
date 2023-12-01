import java.util.Scanner;

public class _7 {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int rot = sc.nextInt();
        boolean direct = false;
        if(rot>0){ // 정수면 시계 수이면 반시계
            direct = true;
        }
        String[][] N = new String[num][num];
        for (int i = 0; i < num; i++) {
            String[] name = sc.nextLine().split(" ");
            for (int j = 0; j < num; j++) {
                N[i][j] =  name[j];
            }
        }

        for (int i = 0; i < rot; i++) {
            fac(N);
        }

    }

    static int[] dy = {1};
    static int[] dx = {0,};
    private static void fac(String[][] n) {
        for (int i = 0; i < num / 2; i++) {
            int x = i;
            int y = i;
            String temp = n[x][y];

            for (int j = 0; j < 4; j++) {

            }




        }
    }
}