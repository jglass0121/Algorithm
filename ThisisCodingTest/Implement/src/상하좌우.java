import java.util.Scanner;
//ㄴ
public class 상하좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] plans = sc.nextLine().split(" ");

        int x = 1, y = 1; //현재위친
        int[]  dx = {-1, 1, 0, 0}; //x
        int [] dy = {0, 0, -1, 1}; //y
        char[] moveTypes = {'L', 'R', 'U', 'D'};


        //현재위치
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            
            int nx = -1, ny = -1; //초기화
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }

            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x =nx;
            y=ny;
        }
        System.out.println(x+" "+y);



    }

}
