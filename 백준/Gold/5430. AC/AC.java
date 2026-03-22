import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Deque<Integer> deque =  new LinkedList<>();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            int n = sc.nextInt();  // 4
            sc.nextLine();
            String str1 = sc.nextLine();
            String str2 = str1.replace("[", "").replace("]", "");
            String[] arr = str2.split(",");
            for (int j = 0; j <n; j++) {
                deque.add(Integer.parseInt(arr[j]));
            }
            boolean isRight = true;
            boolean isError = false;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == 'R') {
                    isRight = !isRight;
                } else{ // D
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if(isRight) deque.pollFirst();
                    else deque.pollLast();
                }
            }

            if (isError) {
                System.out.println("error");
            }else{
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(isRight ? deque.pollFirst() : deque.pollLast());
                    if(!deque.isEmpty()) sb.append(",");
                }
                sb.append("]");
                System.out.println(sb);
            }


        }
    }
}
