package L1;

import java.util.Arrays;
import java.util.LinkedList;

public class _체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 2, 3};
        int[] reserve = {2, 3, 4};
        System.out.println(solution(n, lost, reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);


        LinkedList<Integer> set = new LinkedList<Integer>();

        for (int i = 0; i < lost.length; i++) {
            set.add(lost[i]);
        }

        n =  n - lost.length;
        int[] visited = new int[31];
        for (int i = 0; i < reserve.length; i++) {
             visited[reserve[i]] += 1;
        }

        for (int i = 0; i < lost.length; i++) {
            if (visited[lost[i]] != 0) {
                visited[lost[i]] -= 1;
                int index = lost[i];
                int findIdx= set.indexOf(index);
                set.remove(findIdx);
            }
        }


        System.out.println("set = " + set.size());

        for (int i = 0; i < set.size(); i++) {
            int one = set.get(i);

            if(visited[one] != 0){
                visited[one] -= 1;
                n++;
                continue;
            }

            if(visited[one-1] != 0){
                visited[one - 1] -= 1;
                n++;
                continue;
            }

            if(visited[one+1] != 0){
                visited[one + 1] -= 1;
                n++;
            }

        }


        return n;
    }
}
