package 해시;

import java.util.HashMap;

public class 전화번호 {
    public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};
        solution(phone_book);
    }

    private static boolean solution(String[] phoneBook) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : phoneBook) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : phoneBook) {
            String str = "";
            String[] splits = s.split("");
            for (String split : splits) {
                str += split;

                if (map.containsKey(str)) {
                    map.get(str);
                    System.out.println("false = " + false);
                    return false;
                }
            }


        }
        System.out.println("true = " + true);
        return true;
    }
}
