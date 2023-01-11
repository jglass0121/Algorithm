package for¹®;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class _8393 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int result =0;
		for (int i = 1; i <= num1; i++) {
			result +=i;
		}
		System.out.println(result);
	}
}
