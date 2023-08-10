package L1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 달리기_경주 {
    public static void main(String[] args) {
        String[] player = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] solution = solution(player, callings);
        System.out.println(Arrays.toString(solution));


    }

    private static  String[] solution(String[] players, String[] callings) {

        String[] answer = {};
        HashMap<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i],i);
        }

        for (String player:callings ) {

            //등수 호출
            int ownRank = rankMap.get(player);

            //앞서 가던 선수 호출
            String beforePlayer = players[ownRank - 1];

            //players배열 갱신
            players[ownRank-1] = player;
            players[ownRank] = beforePlayer;

            //rankMap갱신 - 같은 키에 삽일할 경우.  나중에 넣은 value로 변경 
            rankMap.put(beforePlayer, ownRank);
            rankMap.put(player, ownRank - 1);
            System.out.println("rankMap.keySet() = " + rankMap) ;

        }

        return players;
    }
}
