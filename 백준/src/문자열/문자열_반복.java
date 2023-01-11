package 문자열;

import java.util.Scanner;

public class 문자열_반복 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		int num1=0;
		for (int i = 0; i < num; i++) {
			num1 = scan.nextInt();
			String s = scan.next();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < num1; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
