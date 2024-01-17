package 실버5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 듣보잡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> res = new LinkedList<>();
        for (int i = 0; i < num1 + num2; i++) {
            String name = sc.nextLine();
            if (list.contains(name)) {
                res.add(name);
                continue;
            }
            list.add(name);
        }

        Collections.sort(res);
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}
