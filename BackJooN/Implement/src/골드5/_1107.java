package 골드5;

import java.util.Scanner;

public class _1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetChannel = sc.nextInt();  // 목표 채널 입력
        int brokenButtonsCount = sc.nextInt();  // 고장난 버튼의 개수 입력
        boolean[] broken = new boolean[10];
        for (int i = 0; i < brokenButtonsCount; i++) {
            int brokenButton = sc.nextInt();
            broken[brokenButton] = true;
        }

        int minPresses = Math.abs(targetChannel - 100);

        for (int channel = 0; channel < 999999; channel++) {
            String channelStr = String.valueOf(channel);
            if (isValidChannel(channelStr, broken)) {
                int presses = channelStr.length() + Math.abs(channel - targetChannel);
                minPresses = Math.min(minPresses, presses);

            }
        }
        System.out.println("minPresses = " + minPresses);
    }

    private static boolean isValidChannel(String channelStr, boolean[] broken) {
        for (char c : channelStr.toCharArray()) {
            if(broken[c-'0']) return false;
        }
        return true;
    }
}
