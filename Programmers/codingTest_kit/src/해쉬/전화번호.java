package 해쉬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 전화번호 {
    public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phoneBook) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++) {
            map.put(phoneBook[i], i);
        }
        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook[i].length(); j++) {
                String substring = phoneBook[i].substring(0, j);

                if (map.containsKey(substring)) {
                    return false;
                }
            }
        }
        return true;
    }

}
