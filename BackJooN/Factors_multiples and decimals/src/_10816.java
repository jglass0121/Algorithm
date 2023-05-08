import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        int num3 = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[num3];
        while (st.hasMoreTokens()) {
            //해당 키가 있다면
            int key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                Integer cnt = map.get(key);
                map.put(key, cnt+1);
            } else { // 처음나오는 키라면
                map.put(key, 1);
            }


        }


        StringBuilder sb = new StringBuilder();

        StringTokenizer st2 = new StringTokenizer(br.readLine());


        while (st2.hasMoreTokens()) {
            int num4 = Integer.parseInt(st2.nextToken());
            if (map.containsKey(num4)) {
                Integer integer = map.get(num4);
                sb.append(integer).append(" ");
            } else {
                sb.append(0).append(" ");
            }

        }

        System.out.println(sb);


    }
}
