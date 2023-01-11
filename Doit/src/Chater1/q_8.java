package Chater1;

import java.util.Scanner;

public class q_8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("n의 값을 입력하세요");
			n =sc.nextInt();
		}while(n<0);
		
		String change = String.format("%s", n);
		
		System.out.println(change.length());
		
		
		
		
	}
}
