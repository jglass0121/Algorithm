package Á¤·Ä;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}

		
		Arrays.sort(b);
		
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
			
		}
		

	}
}
