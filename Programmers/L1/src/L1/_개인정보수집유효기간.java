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
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] split = terms[i].split(" ");
            int split2 = Integer.parseInt(split[1]);
            map.put(split[0],split2);
        }
        today = today.replace(".","/");
        Date todatDate = new Date(today);
        LinkedList<Integer> list = new LinkedList();

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");

            String date = split[0].replace(".", "/");
            String rank = split[1];

            Integer month = map.get(rank);

            //int m = m + month;
            Date dates = new Date(date);

            month = month + (dates.getMonth());
            dates.setMonth(month);
            dates.setDate(dates.getDate());

            if (month > 12) {
                if (dates.getDate() == 1) {
                    dates.setMonth(month-1);
                    dates.setDate(28);
                }
            } else {
                dates.setDate(dates.getDate()-1);
            }



            if (todatDate.after(dates)) {
                list.add(i + 1);

            }


        }


        List<Integer> lists = list.stream().collect(Collectors.toList());
        int[] answer = new int[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            answer[i] = (int) lists.get(i);
        }

        return answer;

    }
}
