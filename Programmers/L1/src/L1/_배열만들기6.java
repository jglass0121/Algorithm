package L1;

import java.util.Arrays;
import java.util.Stack;

public class _배열만들기6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};

        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    private static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while(index < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[index]);
                index++;
                continue;
            }
            if(stack.peek() == arr[index]){
                stack.pop();
                index++;
            }else{
                stack.push(arr[index]);
                index++;
            }
        }
        if(stack.size() == 0){
            return new int[]{-1};
        }
        int[] result = new int[stack.size()];
        for(int i = stack.size() - 1 ; i >= 0 ; i--){
            result[i] = stack.pop();
        }
        return result;
    }

}
