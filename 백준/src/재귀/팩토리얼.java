package Àç±Í;

import java.util.Scanner;

public class ÆÑÅä¸®¾ó {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		sc.close();
		int sum=fact(num);
		System.out.println(sum);
		
		
	}
	static int fact(int num) {
		if(num<=1) return 1;
		return num*fact(num-1);
	}
}
