import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();


        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            //존재하는 이름이라면 leave를한다.(boolean)으로 체크
            String name = st.nextToken();
            String come =  st.nextToken();

            if (!map.containsKey(name)) { //이름이 없다면
                map.put(name, come);
            } else {
                map.remove(name);
                map.put(name, come);
            }

        }


        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (String key: list) {
            if (map.get(key).equals("enter")) {
                System.out.println(key);
            }
        }




    }
}
