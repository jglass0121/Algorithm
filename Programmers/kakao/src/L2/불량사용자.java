package L2;

import java.util.HashSet;
import java.util.Iterator;


public class 불량사용자 {
    public static void main(String[] args) {
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"fr*d*", "*rodo", "******", "******"};
        System.out.println(solution(user_id, banned_id));
        Iterator<HashSet<String>> iterator = result.iterator();
        while (iterator.hasNext()) {
            HashSet<String> next = iterator.next();
            System.out.print(" "+ next);
        }


    }

    static String[] userIds;
    static String[] bannedIds;
    static HashSet<HashSet<String>> result = new HashSet<>();
    private static int solution(String[] userId, String[] bannedId) {
        userIds = userId;
        bannedIds = bannedId;
        dfs(new HashSet<String>(), 0);
        return result.size();

    }

    private static void dfs(HashSet<String> res, int depth) {
        if (depth == bannedIds.length)
        {
            result.add(res);
            return;
        }

        for (int i = 0; i < userIds.length; i++) {
            if (res.contains(userIds[i])) {
                continue;
            }
            if (check(userIds[i], bannedIds[depth])) {
                res.add(userIds[i]);
                dfs(new HashSet<>(res), depth + 1); //주소값 완전 초기화
                res.remove(userIds[i]);
            }
        }
    }

    private static boolean check(String userId, String bannedId) {
        if (userId.length() != bannedId.length()) {
            return false;
        }
        for (int i = 0; i < userId.length(); i++) {
            if (bannedId.charAt(i) == '*') {
                continue;
            }
            if (bannedId.charAt(i) != userId.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
