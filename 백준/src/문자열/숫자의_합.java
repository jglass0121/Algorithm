package 문자열;

import java.util.Scanner;

public class 숫자의_합 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("개수를 입력하세요");
		int num = scan.nextInt();
		int sum = 0;
		String str = scan.next();
		for (int i = 0; i < num; i++) {
			sum+=str.charAt(i)-'0';
		}
		
		System.out.println(sum);
	}
}
