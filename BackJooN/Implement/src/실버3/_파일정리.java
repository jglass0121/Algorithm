package 실버3;

import java.util.*;

public class _파일정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            String[] split = s.split("\\.");
            String key = split[1];
            map.put(key, map.getOrDefault(split[1], 0) + 1);
        }
        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (String key : list) {
            System.out.println(key+" "+map.get(key));
        }
    }
}
