import java.util.Arrays;

public class 가사검색 {
    public static void main(String[] args) {
        String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
        solution(words, queries);
    }

    private static void solution(String[] words, String[] queries) {
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }
}
