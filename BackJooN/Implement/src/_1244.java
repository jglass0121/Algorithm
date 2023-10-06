import java.util.Scanner;

public class _1244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 스위치 개수 입력
        int numSwitches = scanner.nextInt();

        // 스위치 배열 초기화 (인덱스 0은 사용하지 않음)
        int[] switches = new int[numSwitches + 1];

        // 스위치 초기 상태 입력
        for (int i = 1; i <= numSwitches; i++) {
            switches[i] = scanner.nextInt();
        }

        // 조작 횟수 입력
        int numOperations = scanner.nextInt();

        // 조작 수행
        for (int i = 0; i < numOperations; i++) {
            int operationType = scanner.nextInt();

            int switchNumber = scanner.nextInt();

            if (operationType == 1) { // 남자일 경우
                for (int j = switchNumber; j <= numSwitches; j += switchNumber) {
                    switches[j] = 1 - switches[j];
                    System.out.println("switches[i] = " + switches[i]);
                }
            } else if (operationType == 2) { // 여자일 경우
                int left = switchNumber - 1;
                int right = switchNumber + 1;
                switches[switchNumber] = 1 - switches[switchNumber];

                while (left >= 1 && right <= numSwitches && switches[left] == switches[right]) {
                    switches[left] = 1 - switches[left];
                    switches[right] = 1 - switches[right];
                    left--;
                    right++;
                }
            }
        }

        // 최종 스위치 상태 출력
        for (int i = 1; i <= numSwitches; i++) {
            System.out.println(switches[i]);
        }
    }
}
