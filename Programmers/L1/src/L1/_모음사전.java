package L1;

public class _모음사전 {
    static char[] arr = {'A', 'E', 'I', 'O', 'U'};
    static int cnt = 0;
    public static void main(String[] args) {
        String word = "AAAAE";
        solution("",0,word);
        System.out.println(cnt);


    }

    private static void solution(String current,int depth,String target) {

        if (current.equals(target)) {
            return;
        }
        if (depth == 5) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            String newWord = current + arr[i];
            cnt++;
            solution(newWord, depth+1,target);
        }
    }
}
