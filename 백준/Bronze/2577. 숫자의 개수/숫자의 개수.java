
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long res = A * B * C;
        String str = "" + res;
        int[] arr = new int[10];

        int cnt = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        set.stream().sorted();


        ArrayList<Integer> list = new ArrayList<>(set);

        //str에서 중복제거
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < str.length(); j++) {
                String strI = "" + list.get(i);
                String s = "" + str.charAt(j);
                if (strI.equals(s)) {
                    cnt++;
                }
            }

            arr[list.get(i)] = cnt;
            cnt = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
