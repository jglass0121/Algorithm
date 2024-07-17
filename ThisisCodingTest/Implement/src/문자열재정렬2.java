import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 문자열재정렬2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        String[] split = str.split("");
        int num = 0;
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            char c = split[i].charAt(0);
            if (Character.isDigit(c)) {
                num += Integer.parseInt(String.valueOf(c));
            } else {
                list.add(c);
            }
        }

//        Collections.sort(list);
//        String res = "";
//        for (int i = 0; i < list.size(); i++) {
//            res += list.get(i);
//        }

        String res = list.stream().sorted().map(String::valueOf).collect(Collectors.joining());

        res += num;
        System.out.println("res = " + res);


    }
}
