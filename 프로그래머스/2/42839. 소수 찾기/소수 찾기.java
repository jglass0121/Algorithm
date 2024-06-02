import java.util.HashSet;

class Solution {
    static boolean[] visited;
    static HashSet<Integer> res =  new HashSet<Integer>();

    public int solution(String numbers) {
        String[] arr = numbers.split("");
        visited = new boolean[arr.length];
        fac(arr,"");
        return res.size();
    }
        private static void fac(String[] numbers, String num) {
        //소수판결 후
        try {
            int number = Integer.parseInt(num);
            if(check(number)) res.add(number);

        } catch (Exception e) {

        }

        for (int i = 0; i < numbers.length; i++) {

            if (!visited[i]) {
                visited[i] = true;
                String num1 = num + numbers[i];
                fac(numbers, num1);
                visited[i] = false;
            }

        }
    }

    private static boolean check(int number) {
        if(number <2 )return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i ==0) return false;
        }
        return true;
    }
}