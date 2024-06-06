package 해쉬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 전화번호_목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        solutoin(phone_book);
    }

    private static boolean solutoin(String[] phoneBook) {
        HashSet<String> hash = new HashSet<String>();
        for (int i = 0; i < phoneBook.length; i++) {
            hash.add(phoneBook[i]);
        }

        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook[i].length(); j++) {
                if (hash.contains(phoneBook[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
