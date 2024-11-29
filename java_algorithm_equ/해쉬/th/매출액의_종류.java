package th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의_종류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer n : solution(N, K, arr)) {
            System.out.print(n+" ");
        }
    }

    private static ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1); // 옆으로 이동
            if (map.get(arr[lt]) == 0) { //count될 수있어서
                map.remove(arr[lt]); //키 삭제
            }
            lt++;

        }
        return answer;


    }
}
