package DFS_BFS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class 오픈채팅방 {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        solution(record);
    }

    private static String[] solution(String[] records) {


        HashMap<String, String> map = new HashMap<>();
        LinkedList<String> list = new LinkedList<>();

        for (String record : records) {
            String[] split = record.split(" ");
            String keyword = split[0];
            String id = split[1];
            if (keyword.equals("Enter")) {
                String name = split[2];
                map.put(id, name);
                list.add(id + " in");

            } else if (keyword.equals("Leave")) {
                list.add(id + " out");
            } else { // 수정
                String name = split[2];
                map.put(id, name);
            }
        }


        LinkedList<String> res = new LinkedList<>();
        for (String s : list) {
            String[] split = s.split(" ");
            String id = split[0];
            String keyword = split[1];

            if (keyword.equals("in")) {
                res.add(map.get(id) + "님이 들어왔습니다.");
            } else {
                res.add(map.get(id) + "님이 나갔습니다.");
            }
        }


        String[] array = res.toArray(new String[0]);
        return array;
    }
}
