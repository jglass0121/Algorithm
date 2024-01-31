package String;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle  = "sad";
        solution(haystack, needle);
        
    }

    private static int solution(String haystack, String needle) {

        if (haystack.contains(needle)) {
            int idx = haystack.indexOf(needle);
            return idx;
        }

        return -1;
    }
}
