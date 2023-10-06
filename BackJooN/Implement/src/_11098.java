import java.util.Scanner;

public class _11098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        while (one-- > 0) {
            int n = sc.nextInt(); // 선수 수
            sc.nextLine(); // 개행 문자 처리

            int max = 0;
            String m_name = "";

            for (int j = 0; j < n; j++) {
                String[] split = sc.nextLine().split(" ");
                int won = Integer.parseInt(split[0]);
                String name = split[1];

                if (won > max) {
                    max = won;
                    m_name = name;
                }
            }

            System.out.println(m_name);
        }
    }
}
