import java.util.ArrayList;
import java.util.Scanner;

public class _1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 전체 인원 수
        int k = scanner.nextInt(); // 끝에서 제거될 순서 번호
        scanner.close();

        ArrayList<Integer> list = new ArrayList<>();

        // 리스트에 1부터 n까지의 숫자 추가
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0; // 현재 위치를 가리키는 인덱스

        System.out.print("<");

        while (list.size() > 1) {
            index = (index + k - 1) % list.size(); // 다음 제거할 위치 계산
            System.out.print(list.remove(index) + ", ");
        }

        // 마지막 원소 출력
        System.out.print(list.get(0) + ">");
    }
}
