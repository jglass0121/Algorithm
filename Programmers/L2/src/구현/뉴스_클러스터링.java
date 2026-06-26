package 구현;

import java.util.LinkedList;

public class 뉴스_클러스터링 {
    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";

        int solution = solution(str1, str2);
        System.out.println("solution = " + solution);
    }

    private static int solution(String str1, String str2) {
        String strOne = str1.toUpperCase();
        String strTwo = str2.toUpperCase();


        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i < strOne.length()-1; i++) {
            String s = "" + strOne.charAt(i) + strOne.charAt(i + 1);
            if (s.matches(".*[^a-zA-Z].*")) {
                continue;
            }

            list1.add(s);
        }


        LinkedList<String> list2 = new LinkedList<>();
        for (int i = 0; i < strTwo.length() - 1; i++) {
            String s = "" + strTwo.charAt(i) + strTwo.charAt(i + 1);
            if (s.matches(".*[^a-zA-Z].*")) {
                continue;
            }

            list2.add(s);
        }




        int totalLen = list1.size() + list2.size();

        int cnt = 0;
        for (int i = 0; i < list1.size(); i++) {
            String poll = list1.poll();
            for (int j = 0; j < list2.size(); j++) {
                String s = list2.get(j);
                if (poll.equals(s)) {
                    list2.poll();
                    cnt++;
                }
            }
        }

        int total = totalLen - cnt;

        if (total == 0) {
            return 65536;
        }
        return (int)((double) cnt/total * 65536);
    }
}
