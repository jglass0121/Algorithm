package ±‚√ 100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_1025 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		br.close();
		//int a = Integer.parseInt(br.readLine());
		int b = 10000;
		for (int i = 0; i < a.length(); i++) {
			int s = a.charAt(i)-'0';
			int result = s*b;
			System.out.printf("[%d]\n",result);
			b = b/10;
			
		}
		
		
		
	
		
	}
}
