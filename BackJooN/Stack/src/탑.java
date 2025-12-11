import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//stack 으로 해결
public class 탑 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        solution(arr);
    }

    private static void solution(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.add(new int[]{arr[0], 1});
        sb.append(0).append(" ");

        for (int i = 1; i < arr.length; i++) {
            int now = arr[i];
            if (stack.peek()[0] <= now) {
                while (!stack.isEmpty() && stack.peek()[0] <= now) {
                        stack.pop();
                }

                if (stack.isEmpty()) {
                    sb.append("0").append(" ");
                }else{
                    int[] peek = stack.peek();
                    sb.append(peek[1]).append(" ");

                }

            }else{
                int[] peek = stack.peek();
                sb.append(peek[1]).append(" ");
            }
            stack.add(new int[]{now,i+1});
        }

        System.out.println(sb.toString());
    }
}
