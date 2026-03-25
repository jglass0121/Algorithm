import java.util.*;

public class _17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        boolean inTag = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '<') {
                // 단어 먼저 뒤집어서 추가
                result.append(word.reverse());
                word.setLength(0);

                inTag = true;
                result.append(c);
            }
            else if (c == '>') {
                inTag = false;
                result.append(c);
            }
            else if (inTag) {
                // 태그 안 → 그대로
                result.append(c);
            }
            else {
                if (c == ' ') {
                    // 단어 끝 → 뒤집기
                    result.append(word.reverse());
                    word.setLength(0);
                    result.append(' ');
                } else {
                    // 단어 쌓기
                    word.append(c);
                }
            }
        }

        // 마지막 단어 처리
        result.append(word.reverse());

        System.out.println(result);
    }
}