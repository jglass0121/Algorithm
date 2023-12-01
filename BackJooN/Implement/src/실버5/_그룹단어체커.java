package 실버5;

import java.util.Scanner;

public class _그룹단어체커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        boolean[] arr = new boolean[26];
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            char prev = 0;
            boolean result = false;
            for (int j = 0; j < s.length(); j++) {
                char now = s.charAt(j);
                if(prev==now){
                    continue;
                }
                if (arr[now-'a']) {
                    result = true;
                    break;
                }
                arr[now-'a'] =true;
                prev = now;
            }
            if(!result){
                cnt++;
            }


        }
        System.out.println(cnt);

    }
}
