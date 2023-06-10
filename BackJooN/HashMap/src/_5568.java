import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int two= Integer.parseInt(br.readLine());
        String[] arr = new String[one];
        for (int i = 0; i <one; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < one; i++) {
            System.out.println("arr[one] = " + arr[one]);

            for (int j = 0; j < two; j++) {

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

                public class _1920 {
                    public static void main(String[] args) throws IOException {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        int one = Integer.parseInt(br.readLine());

                        Set<Integer> arr1 = new HashSet<>();

                        StringTokenizer st = new StringTokenizer(br.readLine());

                        for (int i = 0; i <one; i++) {
                            arr1.add( Integer.parseInt(st.nextToken()));
                        }

                        int two = Integer.parseInt(br.readLine());
                        StringBuilder sb = new StringBuilder();
                        StringTokenizer st2 = new StringTokenizer(br.readLine());
                        for (int i = 0; i < two; i++) {
                            int s = Integer.parseInt(st2.nextToken());
                            if (arr1.contains(s)) {
                                sb.append("1").append("\n");
                            } else {
                                sb.append("0").append("\n");
                            }
                        }

                        System.out.println(sb);

                    }


                }

            }


        }


    }
}
