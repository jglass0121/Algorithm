package ±‚√ 100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(":");
		int[] num = new int[3];
		for (int i = 0; i < s.length; i++) {
			num[i]=Integer.parseInt(s[i]);
		}
		
		System.out.println(num[1]);
	}
}
