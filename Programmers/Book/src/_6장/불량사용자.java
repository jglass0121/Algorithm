package _6장;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class 불량사용자 {
    String[] userIds;
    String[] bannedIds;
    static HashSet<HashSet<String>> result = new HashSet<>();


    public static void main(String[] args) {
        String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id = {"*rodo", "*rodo", "******"};
        불량사용자 a = new 불량사용자();
        a.solution(user_id, banned_id);

        System.out.println(result.size());
    }

    private  void solution(String[] userId, String[] bannedId) {
        userIds = userId;
        bannedIds = bannedId;
        dfs(new HashSet<>(), 0);

    }

    //불량 아이디 별로 조건에 만족하는 아이디를 HashSet에 넣어준다.
    private void dfs(HashSet<String> set, int depth) {
        if (depth == bannedIds.length) {
            result.add(set);
            return;
        }
        for (int i = 0; i < userIds.length; i++) {
            if (set.contains(userIds[i])) {
                continue;
            }
            if (check(userIds[i], bannedIds[depth])) {
                set.add(userIds[i]);
                dfs(new HashSet<>(set), depth + 1);
                set.remove(userIds[i]);
            }
        }

    }

    private boolean check(String userId, String bannedId) {
        if (userId.length() != bannedId.length()) {
            return false;
        }
        boolean match = true;
        for (int i = 0; i < userId.length(); i++) {
            if (bannedId.charAt(i) != '*' && userId.charAt(i) != bannedId.charAt(i)) {
                match = false;
                break;
            }
        }
        return match;

    }
}
