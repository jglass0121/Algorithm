package L1;

import java.lang.reflect.Type;
import java.util.HashMap;

public class _성격 {
    public static void main(String[] args) {
        String[] survey = {"RT", "RT", "RT"};
        int[] choices = {7, 2, 4};

        System.out.println(solution(survey, choices));

    }

    private static String solution(String[] survey, int[] choices) {
        HashMap<Integer, String> scoreTable = new HashMap<>();
        scoreTable.put(1, "f 3");
        scoreTable.put(2, "f 2");
        scoreTable.put(3, "f 1");
        scoreTable.put(4, "a 0");
        scoreTable.put(5, "s 1");
        scoreTable.put(6, "s 2");
        scoreTable.put(7, "s 3");

        HashMap<String, Integer> type = new HashMap<>();
        type.put("R", 0);
        type.put("T", 0);
        type.put("C", 0);
        type.put("F", 0);
        type.put("J", 0);
        type.put("M", 0);
        type.put("A", 0);
        type.put("N", 0);

        for (int i = 0; i < choices.length; i++) {
            int choice = choices[i];
            String s = survey[i];
            String[] splitType = s.split("");
            String firstType = splitType[0];
            String secondType = splitType[1];

            String tableVal = scoreTable.get(choice);
            String[] tableSplit = tableVal.split(" ");

            String order = tableSplit[0];
            int val = Integer.parseInt(tableSplit[1]);

            if (order.equals("f")) {
                type.put(firstType,type.get(firstType) + val);
            } else if (order.equals("a")) {
                continue;
            } else {
                type.put(secondType, type.get(secondType) + val);
            }

        }

        String[] TypeOrder = {"RT", "CF", "JM", "AN"};
        String answer = "";
        for (int i = 0; i < 4; i++) {
            String types = TypeOrder[i];
            String[] typeSplit = types.split("");
            String oneType = typeSplit[0];
            String twoType = typeSplit[1];

            Integer oneVal = type.get(oneType);
            Integer twoVal = type.get(twoType);

            if (oneVal > twoVal) {
                answer += oneType;
            } else if (oneVal < twoVal) {
                answer += twoType;
            } else {
                answer+= oneType;
            }

        }

        return answer;
    }
}