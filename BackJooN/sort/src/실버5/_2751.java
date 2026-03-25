package 실버5;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
