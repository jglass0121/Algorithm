package 완전탐색;

import java.util.HashSet;

public class 소수찾기 {
    public static void main(String[] args) {
        String numbers = "011";
        solution(numbers);

    }



    private static void solution(String numbers) {
        String[] arr = numbers.split("");
        HashSet<String> res = new HashSet<>();
        fac(arr, 0,res,"");
    }


    private static void fac(String[] arr, int cnt, HashSet<String> res, String checkRes) {

        if (cnt == arr.length-1) {
            return;
        }
        if (isPrime()) {
            res.add(checkRes);
        }


        for (int i = cnt; i < arr.length; i++) {
            String s = arr[i];
            checkRes += s;

        }

    }

    //소수인가
    private static boolean isPrime() {


        return false;
    }

}
