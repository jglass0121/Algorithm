package 실버3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 파일정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            String[] split = str.split("\\.");
            map.put(split[1], map.getOrDefault(split[1], 0) + 1);
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(i-> {
            System.out.println(i.getKey() + " " + i.getValue());
        });



    }
}
