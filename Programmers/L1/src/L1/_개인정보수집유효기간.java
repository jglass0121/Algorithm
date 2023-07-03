package L1;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

//파기해야할 것을 배열로
public class _개인정보수집유효기간 {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        int[] solution = solution(today, terms, privacies);
        System.out.println(Arrays.toString(solution));


    }

    private static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String[] split = terms[i].split(" ");
            int split2 = Integer.parseInt(split[1]);
            map.put(split[0],split2);
        }


        String[] todays = today.split("\\.");

        //모두 일로 변경
        int Totaltoday =  (Integer.parseInt(todays[0]) * 12 * 28 )+(Integer.parseInt(todays[1])* 28 )+(Integer.parseInt(todays[2]));

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= Totaltoday) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
        }


        private static int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }



}
