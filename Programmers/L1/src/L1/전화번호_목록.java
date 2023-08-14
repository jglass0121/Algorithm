package L1;

import java.util.Arrays;

public class 전화번호_목록 {
    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        String[] phoneBook2 = {"123","456","789"};
        String[] phoneBook3= {"12","123","1235","567","88"};
        System.out.println(solution(phoneBook));
        System.out.println(solution(phoneBook2));
        System.out.println(solution(phoneBook3));



    }

    private static boolean solution(String[] phoneBook) {
        boolean result = true;
        Arrays.sort(phoneBook);
        for (int i = 0; i < phoneBook.length-1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) {
                return false;
            }

        }
        return result;
    }
}
