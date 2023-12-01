package 실버3;

import java.util.*;

public class _랭깅전_대기열 {
    public static class Player implements Comparable<Player> {
        int level;
        String name;
        boolean check;

        public Player(int level, String name) {
            this.level = level;
            this.name = name;
        }

        @Override
        public int compareTo(Player p1) {
            return name.compareTo(p1.name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p= sc.nextInt();
        int m = sc.nextInt();
        Player[] players = new Player[p];
        StringBuilder sb = new StringBuilder();
        sc.nextLine();
        for (int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int level = Integer.parseInt(st.nextToken());
            String nickName = st.nextToken();
            players[i] = new Player(level, nickName);
        }


        for (int i = 0; i < p; i++) {
            ArrayList<Player> room = new ArrayList<>();
            if (!players[i].check) {
                for (int j = i; j < p; j++) {
                    if (room.size() == m) {
                        break;
                    }

                    int level = players[j].level;
                    String name = players[j].name;
                    if (!players[j].check && players[i].level - 10 <= level && players[i].level + 10 >= level) {
                        players[j].check = true;
                        room.add(new Player(level, name));
                    }

                }
                Collections.sort(room);
                if (room.size() == m) {
                    sb.append("Started!").append("\n");
                } else {
                    sb.append("Waiting!").append("\n");
                }

                for (Player player:room) {
                    sb.append(player.level).append(" ").append(player.name).append("\n");
                }
            }

        }
        System.out.println(sb);

    }
}

