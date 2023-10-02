import java.util.Scanner;

public class _10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String[] split = sc.nextLine().split(" ");
            int h = Integer.parseInt(split[0]); // 층수
            int w = Integer.parseInt(split[1]); // 방 수
            int n = Integer.parseInt(split[2]); // 몇 번째 손님

            int floor = n % h; // 층수 계산
            int room = (n / h) + 1; // 방 번호 계산

            if (floor == 0) {
                floor = h;
                room -= 1;
            }

            // 방 번호 출력 형식에 맞게 출력
            System.out.printf("%d%02d\n", floor, room);
        }
    }

}
