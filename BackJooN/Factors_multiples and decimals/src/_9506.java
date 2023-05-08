import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;

            }

            
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    list.add(i);
                    sum += i;

                }
            }



            String result = null;
            StringBuilder sb = new StringBuilder();
            if (sum == num) {
                System.out.print(num +" = ");
                for (int i = 0; i < list.size(); i++) {
                    result = i == list.size() - 1 ? "" + list.get(i) : list.get(i) + " + ";
                    System.out.print(result);
                }
                System.out.println();

            } else {
                System.out.println(num + " is NOT perfect.");
            }


        }

    }
}
