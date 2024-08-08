import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] elements) {
          Set<Integer> res = new HashSet<>();
        for (int i = 1; i <= elements.length; i++) { //  길이만큼
            Set<Integer> separate = new HashSet<>();
            for (int j = 0; j < elements.length; j++) { // 1
                int sum = 0;
                int count = 0;
                for (int k = j; count < i; k++) {
                    sum += elements[k % elements.length];
                    count++;
                }
                separate.add(sum);
            }

            res.addAll(separate);
        }

        return res.size();
    }
}