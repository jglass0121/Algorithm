package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 달팽이는_올라가고_싶다 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		int day = (V-B)/(A-B);
		System.out.println(day);
		
				
		
	}
}
