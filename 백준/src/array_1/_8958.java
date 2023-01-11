package array_1;

import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번 반복하겠습니까?");
		int num = scan.nextInt();
		String str[] = new String[num];
		for (int i = 0; i < num; i++) {
			str[i] = scan.next();
		}
		scan.close();

		for (int i = 0; i < str.length; i++) {
			
			int sum = 0;
			int count = 0;
			
			for (int j = 0; j < str[i].length(); j++) {
				
				if (str[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
