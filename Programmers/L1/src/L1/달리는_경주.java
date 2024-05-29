package L1;

import java.util.Arrays;
import java.util.HashMap;

public class 달리는_경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
        ;

    }

    private static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String calling = callings[i];
            Integer rank = map.get(calling);

            //배열 변경
            String beforePlayer = players[rank - 1];
            players[rank - 1] = calling;
            players[rank] = beforePlayer;


            //map 변경
            map.put(beforePlayer, rank);
            map.put(calling, rank-1);

        }

        return players;


    }
}
