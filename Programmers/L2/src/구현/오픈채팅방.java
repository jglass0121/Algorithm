package 구현;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class 오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] solution = solution(record);
        System.out.println(Arrays.toString(solution));
    }

    private static String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        LinkedList<String[]> list = new LinkedList<>();
        for (String arr : record) {
            String[] split = arr.split(" ");
            String call = split[0];
            String id = split[1];
            String name = "";
            if (!call.equals("Leave")) {
                name = split[2];
            }
            if (call.equals("Enter")) {
                map.put(id, name);
                list.add(new String[]{id,"enter"});

            } else if (call.equals("Leave")) {
                list.add(new String[]{id,"remove"});

            } else { // Change
                map.put(id, name);
            }
        }

        String[] answer = new String[list.size()];
        int idx = 0;
        for (String[] arr : list) {
            String id = arr[0];
            String call = arr[1];
            if (call.equals("enter")) {
                answer[idx] = map.get(id) + "님이 들어왔습니다.";
            } else if (call.equals("remove")) {
                answer[idx] = map.get(id) + "님이 나갔습니다.";

            }
            idx++;
        }

        return answer;
    }
}
