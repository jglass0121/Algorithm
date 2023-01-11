package array_1;

import java.util.Iterator;
import java.util.Scanner;

public class _4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개 입력할 것인가요?");
		int num = scan.nextInt();
		int str[];
		System.out.println("학생은 몇 명입니까?");
		for (int i = 0; i < num; i++) {
			int numS = scan.nextInt();
			str = new int[numS];
			double sum = 0;
			// 성적 입력
			for (int j = 0; j < numS; j++) {
				int val = scan.nextInt();
				str[j] = val;
				sum += val;
			}
			double avg =(sum/numS);
			double count = 0;
			
			for(int j =0;j<numS;j++) {
				if(str[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/numS)*100 );
		}
	}
}
