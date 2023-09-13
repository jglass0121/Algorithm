package _7장;

import java.sql.Array;
import java.util.*;

public class 메뉴리뉴얼 {
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        List<String> result = solution(orders, course);
        for (String menu : result) {
            System.out.println(menu);
        }
    }

    
    public static List<String> solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();

        for (int len : course) {
            HashMap<String, Integer> menuCount = new HashMap<>();
            for (String order : orders) {
                char[] orderArray = order.toCharArray();
                Arrays.sort(orderArray);
                combination(menuCount, orderArray, 0, "", len);
            }

            ArrayList<Map.Entry<String, Integer>> menuList = new ArrayList<>(menuCount.entrySet());
            menuList.sort((a, b) -> b.getValue() - a.getValue()); // 주문횟수에 따라 내림차수

            // 주문횟수의 가장 큰 값이 2보다 크거나 값이 있을 경우
            if (!menuList.isEmpty() && menuList.get(0).getValue() >= 2) {
                int maxCount = menuList.get(0).getValue(); //가장 큰 값

                for (Map.Entry<String, Integer> entry : menuList) {
                    if (entry.getValue() == maxCount) {
                        answer.add(entry.getKey());
                    } else {
                        break;
                    }

                }
            }


        }
        Collections.sort(answer);
        return answer;
    }

    private static void combination(HashMap<String, Integer> menuCount, char[] orderArray, int index, String current, int len) {
        if (current.length() == len) { // 해당길이까지
            menuCount.put(current, menuCount.getOrDefault(current, 0) + 1);
            return;
        }


        for (int i = index; i < orderArray.length; i++) {
            System.out.println("i = " + i); //다음 선택 문자 인덱스
            System.out.println("index = " + index); // 현재 선택 문자
            System.out.println("orderArray[i] = " + orderArray[i]);
            combination(menuCount, orderArray, i+1, current+orderArray[i], len);

        }
        System.out.println();


    }

}


