import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        StringBuilder reverseStr = new StringBuilder();
        boolean isFlat = false;
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            if (now == '<') {
                if (reverseStr.length() > 0) { // 값이 있는 경우
                    res.append(reverseStr.reverse().toString());
                    reverseStr.setLength(0); // 초기황
                }
                res.append(now);

                isFlat = true;
                continue;
            }
            if (now == '>') {
                res.append(now);
                isFlat = false;
                continue;
            }
            if (now == ' ') {
                if (reverseStr.length() > 0) { // 값이 있는 경우
                    res.append(reverseStr.reverse().toString());
                    reverseStr.setLength(0); // 초기황
                }
                res.append(now);
                continue;
            }

            if (isFlat) {
                res.append(now);
            }else{
                reverseStr.append(now);
            }

        }

        if (reverseStr.length() > 0) {
            res.append(reverseStr.reverse().toString());
            reverseStr.setLength(0); // 초기황        }


    }
        System.out.println(res.toString());


    }
}
