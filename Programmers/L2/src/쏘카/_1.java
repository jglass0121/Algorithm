package 쏘카;

import java.sql.Array;
import java.util.*;

public class _1 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>(); // Corrected the ArrayList type

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        visited = new boolean[num];
        int[] ordeers = {1, 2, 1, 3, 3, 2};
        solution(num, ordeers);

    }

    private static void solution(int num, int[] orders) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        dfs(arr, 0, list);

        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (ArrayList arrayList : res) {
            Deque<Integer> deque = new ArrayDeque<>(arrayList);
            LinkedList<Integer> linkedList = new LinkedList<>();

            for (int j = 0; j < orders.length; j++) {
                int order = orders[j];
                Integer peeked = deque.peekLast();
                if (!peeked.equals(order)) {
                    cnt++;
                    linkedList.add(peeked);
                }
                deque.removeFirst();




            }


        }
    }

    private static void dfs(int[] arr, int cnt, ArrayList<Integer> list) {
        if (cnt == arr.length) {
            res.add(new ArrayList<>(list)); // Add a copy of the list to res
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(arr[i]);
                list.add(arr[i]);
                dfs(arr, cnt + 1, list);
                list.remove(list.size() - 1); // Backtrack
                list.remove(list.size() - 1); // Backtrack
                visited[i] = false;
            }
        }
    }
}
