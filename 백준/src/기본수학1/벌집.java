package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 벌집 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int now =1;
		int count =1;
		while(n>now) {
			now +=6*count++;
			System.out.println(now);
			
		}
		System.out.println(count);
		br.close();
				
	}
}
